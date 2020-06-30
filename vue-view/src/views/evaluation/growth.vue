<template>
  <div class="app-container">
    <div class="filter-container">
      <span>部门</span>
      <el-select v-model="listQuery.did" @change="dept" placeholder="请选择">
        <el-option
          v-for="item in deptOptions"
          :key="item.id"
          :label="item.departmentname"
          :value="item.id"
        />
      </el-select>
      <span>岗位</span>
      <el-select v-model="listQuery.pid" placeholder="请选择">
        <el-option
          v-for="item in postOptions"
          :key="item.id"
          :label="item.postname"
          :value="item.id"
        />
      </el-select>
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="getListCondition"><!--@click="getList"-->
        查询
      </el-button>
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-refresh" @click="getReset"><!--@click="getReset"-->
        重置
      </el-button>

      <div id="echartsId" :style="{width:'100%',height: '550px'}"></div>
    </div>
  </div>
</template>

<script>
  import { deptOptions,postOptions,getsel,getselCondition} from '@/api/sys/postrisk'
  //let echarts = require('echarts/lib/echarts')
  // 引入柱状图组件
  require('echarts/lib/chart/bar')
  // 引入提示框和title组件
  require('echarts/lib/component/tooltip')
  require('echarts/lib/component/title')
  export default {
    data(){
      return {
        deptOptions: [],
        postOptions: [],
        listQuery: {
          pid: '',
          did: ''
        },
        getdate:['2018','2019','2020'],
        getsel:[],
        Three_num:[0,2,1],
        primary_num:[11, 11, 1],
        second_num:[1, -2, 2],
        setdate:[],
        option:
          {
            title: {
              text: '风险比例',
              subtext: '审计科'
            },
            tooltip: {
              trigger: 'axis'
            },
            legend: {
              data: ['一级风险', '二级风险','三级风险']
            },
            toolbox: {
              show: true,
              feature: {
                dataZoom: {
                  yAxisIndex: 'none'
                },
                dataView: {readOnly: false},
                magicType: {type: ['line', 'bar']},
                restore: {},
                saveAsImage: {}
              }
            },
            xAxis: {
              type: 'category',
              boundaryGap: false,
              data: ['2019','2020','2021']
            },
            yAxis: {
              type: 'value',
              axisLabel: {
                formatter: '{value}'
              }
            },
            series: [
              {
                name: '一级风险',
                type: 'line',
                data: [1,2,3],
                markPoint: {
                  data: [
                    {type: 'max', name: '最大值'},
                    {type: 'min', name: '最小值'},
                  ]
                },
                markLine: {
                  data: [
                    {type: 'average', name: '平均值'}
                  ]
                }
              },
              {
                name: '二级风险',
                type: 'line',
                data: [2,1,3],
                markPoint: {
                  data: [
                    {type: 'max', name: '最大值'},
                    {type: 'min', name: '最小值'}
                  ]
                },
                markLine: {
                  data: [
                    {type: 'average', name: '平均值'},
                    [{
                      symbol: 'none',
                      x: '90%',
                      yAxis: 'max'
                    }, {
                      symbol: 'circle',
                      /*label: {
                        position: 'start',
                        formatter: '最大值'
                      },*/
                      type: 'max',
                      name: '最高点'
                    }]
                  ]
                }
              },
              {
                name: '三级风险',
                type: 'line',
                data: [2,3,1],
                markPoint: {
                  data: [
                    {type: 'max', name: '最大值'},
                    {type: 'min', name: '最小值'}
                  ]
                },
                markLine: {
                  data: [
                    {type: 'average', name: '平均值'}
                  ]
                }
              }
            ]
          }
      }
    },
    created() {
      console.log('进入created')
      deptOptions().then(rep=>{
        this.deptOptions=rep.data.items
      })
      getsel().then(rep=>{
        this.primary_num=[]
        this.Three_num=[]
        this.second_num=[]
        this.getdate=[]
        var i=0
        rep.data.items.forEach(ep =>{
          if (ep.grade === 1){
            this.primary_num[i]=ep.sum
          }else{
            this.primary_num[i]=0
          }
          if(ep.grade === 3){
            this.Three_num[i]=ep.sum
          }else{
            this.Three_num[i]=0
          }
          if(ep.grade === 2){
            this.second_num[i]=ep.sum
          }else{
            this.second_num[i]=0
          }
          if(this.setdate !==undefined && this.setdate.length > 0){
            if (this.setdate.indexOf(ep.creationTime) === -1){
              this.$set(this.setdate,this.setdate.length,ep.creationTime)
            }
          }else{
            this.setdate[i]=ep.creationTime
          }
          i++;
        })
        this.option.series[0].data=this.primary_num
        this.option.series[1].data=this.second_num
        this.option.series[2].data=this.Three_num
        this.option.xAxis.data= this.setdate
      })
    },
    methods:{
      dept(val=0){
        this.listQuery.pid= ''
        postOptions(this.listQuery.did).then(rep=>{
          this.postOptions=rep.data.items
        })
      },
      getReset(){
        this.listQuery.did=''
        this.listQuery.pid=''
        this.getsel();
      },
      getListCondition(){
        getselCondition(this.listQuery).then(rep=>{
          var i=0
          this.primary_num=[]
          this.Three_num=[]
          this.second_num=[]
          this.setdate=[]
          rep.data.items.forEach(ep =>{
            if (ep.grade === 1){
              this.primary_num[i]=ep.sum
            }else{
              this.primary_num[i]=0
            }
            if(ep.grade === 3){
              this.Three_num[i]=ep.sum
            }else{
              this.Three_num[i]=0
            }
            if(ep.grade === 2){
              this.second_num[i]=ep.sum
            }else{
              this.second_num[i]=0
            }
            if(this.setdate !==undefined && this.setdate.length > 0){
              if (this.setdate.indexOf(ep.creationTime) === -1){
                this.$set(this.setdate,this.setdate.length,ep.creationTime)
              }
            }else{
              this.setdate[i]=ep.creationTime
            }
            i++;
          })
         /* console.log( this.primary_num)
          console.log( this.Three_num)
          console.log( this.second_num)
          console.log( this.setdate)*/
          this.option.series[0].data=this.primary_num
          this.option.series[1].data=this.second_num
          this.option.series[2].data=this.Three_num
          this.option.xAxis.data=  this.setdate
        })
      },
      init(){
        console.log('进入init')
        this.chart = this.$echarts.init(document.getElementById('echartsId'))
        this.chart.setOption(this.option,true)
      }
    }, watch: {
      option:{
        handler(newVal,oldVal){
          if (this.chart){
            if (newVal){
              this.chart.setOption(newVal,true)
            }else{
              this.chart.setOption(oldVal,true)
            }
          }else{
            this.init()
          }
        },
        deep: true //对象内监听
      }
    }
  }
</script>

<style scoped>

</style>
