<template>
  <div class="app-container">
    <div class="filter-container">
      <span>来访人姓名</span><el-input v-model="listQuery.visitor" placeholder="请输入" style="width: 200px;" class="filter-item"/>
      <span>被反映人姓名</span><el-input v-model="listQuery.defendant" placeholder="请输入" style="width: 200px;" class="filter-item"/>
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="getList">
        查询
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate">
        添加
      </el-button>
      <el-button class="filter-item" type="primary" icon="el-icon-refresh" @click="getReset"><!--@click="getReset"-->
        重置
      </el-button>
    </div>
    <!--  数据表格-->
    <el-table
      :key="tableKey"
      v-loading="listLoading"
      :data="list"
      border
      fit
      highlight-current-row
      style="width: 100%;"
    >
      <el-table-column type="selection" width="55" align="center">
      </el-table-column>

      <el-table-column label="信访时间" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.creationtime | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>
        </template>
      </el-table-column>

      <el-table-column label="来访人姓名" min-width="120px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.visitor }}</span>
        </template>
      </el-table-column>
      <el-table-column label="来访人部门/单位" min-width="120px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.visitordepartment }}</span>
        </template>
      </el-table-column>
      <el-table-column label="来访人岗位/职务" min-width="120px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.visitpost }}</span>
        </template>
      </el-table-column>
      <el-table-column label="被反映人姓名" min-width="120px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.defendant }}</span>
        </template>
      </el-table-column>
      <el-table-column label="被反映人部门/单位" min-width="120px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.defendantdepartment }}</span>
        </template>
      </el-table-column>
      <el-table-column label="被反映人岗位/职务" min-width="120px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.defendantpost }}</span>
        </template>
      </el-table-column>
      <el-table-column label="原始信访内容" min-width="120px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.visitcontent }}</span>
        </template>
      </el-table-column>
      <el-table-column label="信访内容摘要" min-width="120px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.visitdigest }}</span>
        </template>
      </el-table-column>
      <!--     自定义列-->
      <el-table-column label="操作" align="center" width="230" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button type="primary" size="mini" @click="handleUpdate(row)">
            修改
          </el-button>
          <el-button size="mini" type="danger" @click="handleDelete(row)">
            删除
          </el-button>
        </template>
      </el-table-column>
    </el-table>
    <!-- 分页工具条  page当前页 total总记录数 limit每页显示多少条 pagination触发自定义事件，查询数据-->
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />

    <!--  绑定了title，是一个数组里取的，表示是修改的标题还是添加的标题
      visible.sync 对话框是否显示
    -->
    <el-dialog  :title="title" :visible.sync="dialogFormVisible" width="800px">
      <!--
          rules:校验规则
          model:数据绑定
      -->
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="100px" style="width: 80%; margin-left:50px;">
        <!--        数据校验要求prop值和temp.属性名一致-->
        <el-form-item label="来访人姓名" prop="visitor">
          <el-input placeholder="请输入" v-model="temp.visitor" />
        </el-form-item>
        <el-form-item label="来访人部门/单位" prop="visitordepartment">
          <el-input placeholder="请输入" v-model="temp.visitordepartment"></el-input>
        </el-form-item>
        <el-form-item label="来访人岗位/职务" prop="visitpost">
          <el-input v-model="temp.visitpost" />
        </el-form-item>
        <el-form-item label="被反映人姓名" prop="defendant">
          <el-input v-model="temp.defendant" />
        </el-form-item>
        <el-form-item label="被反映人部门/单位" prop="defendantdepartment">
          <el-input v-model="temp.defendantdepartment" />
        </el-form-item>
        <el-form-item label="被反映人岗位/职务" prop="defendantpost">
          <el-input v-model="temp.defendantpost" />
        </el-form-item>
        <el-form-item label="原始信访内容" prop="visitcontent">
          <el-input placeholder="....暂无内容" v-model="temp.visitcontent" />
        </el-form-item>
        <el-form-item label="信访内容摘要" prop="visitdigest">
          <el-input placeholder="....暂无内容" v-model="temp.visitdigest" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">
          取消
        </el-button>
        <!--
          dialogStatus==='create'?createData():updateData()
          dialogStatus需要我们根据情况去改变
        -->
        <el-button type="primary" @click="dialogStatus==='create'?createData():updateData()">
          确认
        </el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  import { add, update, list, deleteUser } from '@/api/sys/report'
  //import {groupDept} from "@/api/sys/dept";
  import waves from '@/directive/waves' // waves directive
  import { parseTime } from '@/utils'
  import Pagination from '@/components/Pagination' // 分页组件
  export default {
    name: 'userTable',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        tableKey: 0,
        list: null, // 后台返回，给数据表格展示的数据
        total: 0, // 总记录数
        listLoading: true, // 是否使用动画
        listQuery: {
          page: 1, // 分页需要的当前页
          limit: 5, // 分页需要的每页显示多少条
          sex: 1,
          username: ''
        },
        deptList: [], // 后台查询出来，分好组的部门信息
        temp: { // 添加、修改时绑定的表单数据
          id: undefined,
          creationtime: '',
          visitor: '',
          visitordepartment: '',
          visitpost: '',
          defendant: '',
          defendantdepartment: '',
          defendantpost: '',
          visitcontent: '',
          visitdigest:''
        },
        title: '添加', // 对话框显示的提示 根据dialogStatus create
        dialogFormVisible: false, // 是否显示对话框
        dialogStatus: '', // 表示表单是添加还是修改的
        rules: {
          // 校验规则
          defendant: [{ required: true, message: '请输入被反映人', trigger: 'blur' }],
          defendantdepartment: [{ required: true, message: '请输入被反映人部门', trigger: 'blur' }],
          defendantpost: [{ required: true, message: '请输入被反映人岗位', trigger: 'blur' }],
          visitcontent: [{ required: true, message: '请输入原始信访内容', trigger: 'blur' }],
          visitdigest: [{ required: true, message: '请输入信访内容摘要', trigger: 'blur' }],
        }
      }
    },
    // 创建实例时的钩子函数
    created() {
      this.getList()
      // 在创建时初始化获得部门信息
      //this.getGroupDept()
    },
    methods: {
      // 获得分好组的部门信息
      /*getGroupDept(){
        groupDept().then((response) => {
          this.deptList = response.data.deptList
        })
      },*/
      // 去后台取数据的
      getList() {
        // 开始转圈圈
        this.listLoading = true
        // debugger // 调试
        list(this.listQuery).then(response => {
          this.list = response.data.items
          this.total = response.data.total
          // 转圈圈结束
          this.listLoading = false
        })
      },
      //重置文本框数据
      getReset(){
        this.listQuery.visitor=''
        this.listQuery.defendant=''
        this.getList();
      },
      // 重置表单数据
      resetTemp() {
        this.temp = {
          id: undefined,
          creationtime: '',
          visitor: '',
          visitordepartment: '',
          visitpost: '',
          defendant: '',
          defendantdepartment: '',
          defendantpost: '',
          visitcontent: '',
          visitdigest:''
        }
      },
      // 显示添加的对话框
      handleCreate () {
        // 重置表单数据
        this.resetTemp()
        // 点击确定时，是执行添加操作
        this.dialogStatus = 'create'
        this.title="添加举报信息"
        // 显示对话框
        this.dialogFormVisible = true
        this.$nextTick(() => {
          // 表单清除验证
          this.$refs['dataForm'].clearValidate()
        })
      },
      // 添加对话框里，点击确定，执行添加操作
      createData() {
        // 表单校验
        this.$refs['dataForm'].validate((valid) => {
          // 所有的校验都通过
          if (valid) {
            // 调用api里的sys里的report.js的ajax方法
            add(this.temp).then((response) => {

              // 关闭对话框
              this.dialogFormVisible = false
              // 刷新数据表格里的数据
              this.getList()
              // 显示一个通知
              this.$notify({
                title: '成功',
                message: response.data.message,
                type: 'success',
                duration: 2000
              })
            })
          }
        })
      },
      // 显示修改对话框
      handleUpdate(row) {
        // 将row里面与temp里属性相同的值，进行copy
        this.temp = Object.assign({}, row) // copy obj
        // 将对话框里的确定点击时，改为执行修改操作
        this.dialogStatus = 'update'
        // 修改标题
        this.title = '修改举报信息'
        // 显示修改对话框
        this.dialogFormVisible = true
        this.$nextTick(() => {
          // 清除校验
          this.$refs['dataForm'].clearValidate()
        })
      },
      // 执行修改操作
      updateData() {
        this.$refs['dataForm'].validate((valid) => {
          // 表单校验通过
          if (valid) {
            // 将temp拷贝到tempData
            const tempData = Object.assign({}, this.temp)
            // 进行ajax提交
            update(tempData).then((response) => {
              // 提交完毕，关闭对话框
              this.dialogFormVisible = false
              // 刷新数据表格
              this.getList()
              // 显示通知
              this.$notify({
                title: '成功',
                message: response.data.message,
                type: 'success',
                duration: 2000
              })
            })
          }
        })
      },
      handleDelete(row) {
        // 先弹确认取消框
        this.$confirm('确认删除【'+row.visitor+'】的信息吗?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          // 调用ajax去后台删除
          deleteUser(row.id).then((response) => {
            // 刷新数据表格
            this.getList()
            // ajax去后台删除
            this.$notify({
              title: '成功',
              message: response.data.message,
              type: 'success',
              duration: 2000
            })
          })
        }).catch(() => {
          this.$message({
            type: 'info',
            message: '已取消删除'
          });
        });

      }
    }
  }
</script>
