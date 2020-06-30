<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="listQuery.supervisiontitle" placeholder="标题" style="width: 200px;" class="filter-item"/>
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="getList">
        查询
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit"
                 @click="handleCreate">
        添加
      </el-button>
      <el-button v-waves :loading="downloadLoading" class="filter-item" type="primary" icon="el-icon-download"
                 @click="handleDownload">
        导出
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
      <el-table-column v-if="show" label="序号" prop="id" sortable="custom" align="center" width="80">
        <template slot-scope="scope">
          <span>{{ scope.row.id }}</span>
        </template>
      </el-table-column>

      <el-table-column label="责任监督编号" min-width="100px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.supervisionid }}</span>
        </template>
      </el-table-column>

      <el-table-column label="责任监督标题" min-width="100px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.supervisiontitle }}</span>
        </template>
      </el-table-column>

      <el-table-column label="责任监督类型" min-width="100px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.supervisiontype }}</span>
        </template>
      </el-table-column>

      <el-table-column label="状态" min-width="100px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.status }}</span>
        </template>
      </el-table-column>

      <el-table-column label="操作" align="center" width="350px" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button type="primary" size="mini" @click="handleUpdate(row)">
            修改
          </el-button>
          <el-button size="mini" type="danger" @click="handleDelete(row)">
            删除
          </el-button>
          <!--          <el-button size="mini" @click="tz">-->
          <!--            发布通知-->
          <!--          </el-button>-->
          <!--          <el-button size="mini" @click="fk" v-if="noshow">-->
          <!--&lt;!&ndash;          :style="{ display: visifk }" &ndash;&gt;-->
          <!--            查看反馈-->
          <!--          </el-button>-->
        </template>
      </el-table-column>
    </el-table>
    <!-- 分页工具条  page当前页 total总记录数 limit每页显示多少条 pagination触发自定义事件，查询数据-->
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit"
                @pagination="getList"/>

    <!--  绑定了title，是一个数组里取的，表示是修改的标题还是添加的标题
      visible.sync 对话框是否显示
    -->
    <el-dialog :title="supervisiontitle" :fullscreen="true" :visible.sync="dialogFormVisible" style="width: 80%">
      <!--
          rules:校验规则
          model:数据绑定
      -->
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="70px"
               style="width: 80%; margin-left:50px;">
        <el-form-item v-if="show" label="责任监督编号" prop="supervisionid">
          <el-input readonly placeholder="" v-model="temp.supervisionid"></el-input>
        </el-form-item>

        <el-form-item label="谈话类型" prop="supervisiontype">
          <el-select v-model="temp.supervisiontype" placeholder="请选择">
            <el-option label="作风建设" value="作风建设"></el-option>
            <el-option label="纪检再监督" value="纪检再监督"></el-option>
            <el-option label="执行力检查" value="执行力检查"></el-option>
          </el-select>
        </el-form-item>

        <el-form-item label="责任监督标题" prop="title">
          <el-input placeholder="请输入标题" v-model="temp.supervisiontitle"></el-input>
        </el-form-item>

        <el-form-item label="内容" prop="content">
          <el-card style="height: 610px;">
            <quill-editor v-model="temp.supervisioncontent" ref="myQuillEditor" style="height: 500px;"
                          :options="editorOption">
            </quill-editor>
          </el-card>
        </el-form-item>

        <el-form-item label="谈话对象单位" prop="talkDempartment">
          <el-select v-model="temp.departmentid" placeholder="请选择">
            <el-option label="综合部" :value="3"></el-option>
            <el-option label="内管组" :value="4"></el-option>
            <el-option label="金刚组" :value="5"></el-option>
            <el-option label="上天部" :value="14"></el-option>
            <el-option label="客服部" :value="15"></el-option>
          </el-select>
        </el-form-item>

        <el-form-item label="创建人" prop="title">
          <el-input readonly placeholder="请输入创建人" v-model="temp.creator = this.$store.state.user.name"></el-input>
        </el-form-item>

        <el-form-item label="状态" prop="status">
          <el-select v-model="temp.status" placeholder="请选择">
            <el-option label="通知" value="通知"></el-option>
            <el-option label="自查" value="自查"></el-option>
            <el-option label="再检查" value="再检查"></el-option>
            <el-option label="整改通知" value="整改通知"></el-option>
            <el-option label="提整改报告" value="提整改报告"></el-option>
            <el-option label="通报" value="通报"></el-option>
            <el-option label="结束" value="结束"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="附件" prop="accessories">
          <el-upload
            v-model="temp.accessories"
            action="/123"
            :before-upload="beforeUpload"
            class="upload-demo"
            ref="upload"
            :on-change="changeMe"
            name="file"
            multiple
            :on-preview="handlePreview"
            :on-remove="handleRemove"
            :file-list="fileList">
            <el-button slot="trigger" size="small" type="primary">选取文件</el-button>
          </el-upload>
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
  import FileSaver from 'file-saver'
  import XLSX from 'xlsx'
  import {quillEditor} from 'vue-quill-editor'
  import 'quill/dist/quill.core.css'
  import 'quill/dist/quill.snow.css'
  import 'quill/dist/quill.bubble.css'
  import {add, update, list, deleteUser, FileUpload} from '@/api/sys/resp'
  import waves from '@/directive/waves' // waves directive
  import {parseTime} from '@/utils'
  import Pagination from '@/components/Pagination' // 分页组件
  export default {
    name: 'userTable',
    components: {Pagination, quillEditor},
    directives: {waves},
    data() {
      return {
        // fileList: this.name,
        action: 'https://jsonplaceholder.typicode.com/posts/',
        mode: {},
        content: null,
        editorOption: {},
        readonly: true,
        show: false,
        tableKey: 0,
        visifk: 'none',
        list: null, // 后台返回，给数据表格展示的数据
        total: 0, // 总记录数
        listLoading: true, // 是否使用动画
        listQuery: {
          page: 1, // 分页需要的当前页
          limit: 3, // 分页需要的每页显示多少条
          // sex: 1,
          supervisiontitle: ''
        },
        deptList: [], // 后台查询出来，分好组的部门信息
        temp: { // 添加、修改时绑定的表单数据
          id: undefined,
          supervisionid: '',
          supervisiontype: '',
          supervisiontitle: '',
          supervisioncontent: '',
          departmentid: '',
          accessories: '',
          creationTime: '',
          creator: '',
          status: ''
        },
        title: '添加', // 对话框显示的提示 根据dialogStatus create
        dialogFormVisible: false, // 是否显示对话框
        dialogStatus: '', // 表示表单是添加还是修改的
        rules: {
          // 校验规则
          // title: [{required: true, message: '标题必填', trigger: 'blur'}]
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
      handleDownload() {
        this.downloadLoading = true
        import('@/vendor/Export2Excel').then(excel => {
          const tHeader = ['supervisionid', 'supervisiontype', 'supervisiontitle', 'supervisioncontent', 'departmentid', 'accessories', 'creationTime', 'creator', 'status']
          const filterVal = ['supervisionid', 'supervisiontype', 'supervisiontitle', 'supervisioncontent', 'departmentid', 'accessories', 'creationTime', 'creator', 'status']
          const data = this.formatJson(filterVal, this.list)
          excel.export_json_to_excel({
            header: tHeader,
            data,
            filename: 'table-list'
          })
          this.downloadLoading = false
        })
      },
      formatJson(filterVal, jsonData) {
        return jsonData.map(v => filterVal.map(j => {
          if (j === 'timestamp') {
            return parseTime(v[j])
          } else {
            return v[j]
          }
        }))
      },
      beforeUpload(file) {
        // alert(11111)
        this.files = file
        this.fileName = file.name
        console.log(this.files)
        console.log(this.fileName)
        return false;
      },
      modeUpload: function (item) {
        // console.log(item.file);
        this.mode = item.file
      },
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
          supervisionid: '',
          supervisiontype: '',
          supervisiontitle: '',
          supervisioncontent: '',
          departmentid: '',
          creationTime: '',
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
        if (this.fileName == "") {
          this.$message({
            type: 'info',
            message: '请选择要上传的文件'
          });
          return false
        }
        console.log(this.files)
        let fileFormData = new FormData();
        fileFormData.append('file', this.files, this.fileName);//filename是键，file是值，就是要传的文件，test.zip是要传的文件名
        let requestConfig = {
          headers: {
            'Content-Type': 'multipart/form-data'
          },
        }
        //表单校验
        this.$refs['dataForm'].validate((valid) => {

          // 所有的校验都通过
          if (valid) {
            // 调用api里的sys里的user.js的ajax方法
            add(this.temp).then((response) => {
              console.log(response.data.id)
              this.$http.post('http://localhost:8888/resp/FileUpload?id=' + response.data.id, fileFormData, requestConfig)
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

            if (this.fileName == "") {
              this.$message({
                type: 'info',
                message: '请选择要上传的文件'
              });
              return false
            }
            console.log(this.files)
            let fileFormData = new FormData();
            fileFormData.append('file', this.files, this.fileName);//filename是键，file是值，就是要传的文件，test.zip是要传的文件名
            let requestConfig = {
              headers: {
                'Content-Type': 'multipart/form-data'
              },
            }

            const tempData = Object.assign({}, this.temp)

            this.$http.post('http://localhost:8888/resp/FileUpload?id=' + tempData.id, fileFormData, requestConfig).then(rep => {
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
        this.$confirm('确认删除【' + row.supervisiontitle + '】的信息吗?', '提示', {
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
          })
        })
      }
    }
  }
</script>
