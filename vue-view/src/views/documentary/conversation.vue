<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="listQuery.talkType" placeholder="标题" style="width: 200px;" class="filter-item"/>
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="getList">
        查询
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate">
        添加
      </el-button>
    </div>
    <el-table
      :key="tableKey"
      v-loading="listLoading"
      :data="list"
      border
      fit
      highlight-current-row
      style="width: 100%;"
    >
      <el-table-column label="序号" prop="id" sortable="custom" align="center" width="80">
        <template slot-scope="scope">
          <span>{{ scope.row.id }}</span>
        </template>
      </el-table-column>

      <el-table-column label="谈话类型" min-width="100px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.talkType }}</span>
        </template>
      </el-table-column>

      <el-table-column label="谈话时间" width="200px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.talkcreationTime | parseTime('{y}-{m}-{d} {h}:{m}:{s}') }}</span>
        </template>
      </el-table-column>

      <el-table-column label="谈话地点" min-width="100px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.talkSite }}</span>
        </template>
      </el-table-column>

      <el-table-column label="状态" min-width="50px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.status }}</span>
        </template>
      </el-table-column>

      <el-table-column label="操作" align="center" width="200px" class-name="small-padding fixed-width">
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
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList"/>

    <!--  绑定了title，是一个数组里取的，表示是修改的标题还是添加的标题
      visible.sync 对话框是否显示
    -->
    <el-dialog :title="talkType" :fullscreen="true" :visible.sync="dialogFormVisible" style="width: 80%">
      <!--
          rules:校验规则
          model:数据绑定
      -->
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="70px"
               style="width: 80%; margin-left:50px;">
        <el-form-item label="谈话对象姓名" prop="talkSite">
          <el-input placeholder="请输入谈话姓名" v-model="temp.talkName"></el-input>
        </el-form-item>
        <el-form-item label="谈话对象单位" prop="talkDempartment">
          <el-select v-model="temp.talkDempartment" placeholder="请选择">
            <el-option label="综合部" :value="3"></el-option>
            <el-option label="内管组" :value="4"></el-option>
            <el-option label="金刚组" :value="5"></el-option>
            <el-option label="上天部" :value="14"></el-option>
            <el-option label="客服部" :value="15"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="谈话对象政治面貌" prop="talkPoliticsStatus">
          <el-select v-model="temp.talkPoliticsStatus" placeholder="请选择">
            <el-option label="中共党员" :value="1"></el-option>
            <el-option label="中共预备党员" :value="2"></el-option>
            <el-option label="共青团员" :value="3"></el-option>
            <el-option label="无党派人士" :value="4"></el-option>
            <el-option label="群众" :value="5"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="谈话对象职务" prop="talkSite">
          <el-input placeholder="谈话对象职务" v-model="temp.talkDuty"></el-input>
        </el-form-item>
        <el-form-item label="谈话类型" prop="talkType">
          <el-select v-model="temp.talkType" placeholder="请选择">
            <el-option label="例行廉政谈话" value="例行廉政谈话"></el-option>
            <el-option label="任前廉政谈话" value="任前廉政谈话"></el-option>
            <el-option label="提醒谈话" value="提醒谈话"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="谈话地点" prop="talkSite">
          <el-input placeholder="请输入谈话地点" v-model="temp.talkSite"></el-input>
        </el-form-item>
        <el-form-item label="记录人" prop="talkSite">
          <el-input placeholder="请输入记录人" v-model="temp.talkPerson"></el-input>
        </el-form-item>
        <el-form-item label="谈话提纲" prop="content">
          <el-card style="height: 610px;">
            <quill-editor v-model="temp.talkOutline" ref="myQuillEditor" style="height: 500px;" :options="editorOption">
            </quill-editor>
          </el-card>
        </el-form-item>
        <el-form-item label="谈话内容" prop="content">
          <el-card style="height: 610px;">
            <quill-editor v-model="temp.talkContent" ref="myQuillEditor" style="height: 500px;" :options="editorOption">
            </quill-editor>
          </el-card>
        </el-form-item>
        <el-form-item label="创建者 " prop="creator">
          <el-input readonly placeholder="请输入创建者" v-model="temp.creator = this.$store.state.user.name"></el-input>
        </el-form-item>
        <el-form-item label="状态" prop="status">
          <el-select v-model="temp.status" placeholder="请选择">
            <el-option label="创建" :value="1"></el-option>
            <el-option label="待审" :value="2"></el-option>
            <el-option label="已审核" :value="3"></el-option>
          </el-select>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">
          取消
        </el-button>
        <el-button type="primary" @click="dialogStatus==='create'?createData():updateData()">
          确认
        </el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  import {quillEditor} from 'vue-quill-editor'
  import 'quill/dist/quill.core.css'
  import 'quill/dist/quill.snow.css'
  import 'quill/dist/quill.bubble.css'
  import {add, update, list, deleteUser} from '@/api/sys/politicianTalk'
  import waves from '@/directive/waves' // waves directive
  import {parseTime} from '@/utils'
  import Pagination from '@/components/Pagination' // 分页组件
  export default {
    name: 'userTable',
    components: {Pagination,quillEditor},
    directives: {waves},
    data() {
      return {
        readonly: true,
        content: null,
        editorOption: {},
        tableKey: 0,
        list: null, // 后台返回，给数据表格展示的数据
        total: 0, // 总记录数
        listLoading: true, // 是否使用动画
        listQuery: {
          page: 1, // 分页需要的当前页
          limit: 5, // 分页需要的每页显示多少条
          talkType: ''
        },
        deptList: [], // 后台查询出来，分好组的部门信息
        temp: { // 添加、修改时绑定的表单数据
          id: undefined,
          talkName: '',
          talkDempartment: '',
          talkPoliticsStatus: '',
          talkDuty: '',
          talkType: '',
          talkcreationTime: '',
          talkSite: '',
          talkPerson: '',
          talkOutline: '',
          talkContent: '',
          datacreationTime: '',
          creator: '',
          status: ''
        },
        title: '添加', // 对话框显示的提示 根据dialogStatus create
        dialogFormVisible: false, // 是否显示对话框
        dialogStatus: '', // 表示表单是添加还是修改的
        rules: {
          // 校验规则
          title: [{required: true, message: '标题必填', trigger: 'blur'}]
        },
        downloadLoading: false
      }
    },
    // 创建实例时的钩子函数
    created() {
      this.getList()
      // 在创建时初始化获得部门信息
      this.getGroupDept()
    },
    methods: {
      // 获得分好组的部门信息
      getGroupDept() {
        groupDept().then((response) => {
          this.deptList = response.data.deptList
        })
      },
      // 去后台取数据的
      getList() {
        // 开始转圈圈
        this.listLoading = true
        list(this.listQuery).then(response => {
          this.list = response.data.items
          this.total = response.data.total
          this.listLoading = false
        })
      },
      // 重置表单数据
      resetTemp() {
        this.temp = {
          id: undefined,
          talkName: '',
          talkDempartment: '',
          talkPoliticsStatus: '',
          talkDuty: '',
          talkType: '',
          talkcreationTime: '',
          talkSite: '',
          talkPerson: '',
          talkOutline: '',
          talkContent: '',
          datacreationTime: '',
          creator: '',
          status: ''
        }
      },
      // 显示添加的对话框
      handleCreate() {
        // 重置表单数据
        this.resetTemp()
        // 点击确定时，是执行添加操作
        this.dialogStatus = 'create'
        this.title = "添加用户"
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
            // 调用api里的sys里的user.js的ajax方法
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
        this.temp = Object.assign({}, row)
        // 将对话框里的确定点击时，改为执行修改操作
        this.dialogStatus = 'update'
        // 修改标题
        this.title = '修改用户'
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
        this.$confirm('确认删除【' + row.talkType + '】的信息吗?', '提示', {
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
