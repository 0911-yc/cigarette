<template>
  <div class="filter-container">
    <!-- <div class="filter-container">-->
    <span style="font-size:15px;color:gray">年份  :</span>
    <el-date-picker type="year" @on-change="handleChange" v-model="temp.year" format="yyyy" placeholder="请选择"
                    style="width: 15%;" class="filter-item" value-format="yyyy">
    </el-date-picker>
    <span style="font-size:15px;color:gray">部门  :</span>
    <el-select placeholder="请选择" v-model="temp.did" class="filter-item" style="width: 15%;">
      <el-option
        v-for="item in deptOptions"
        :key="item.id"
        :label="item.departmentname"
        :value="item.id"
      />
    </el-select>
    <span style="font-size:15px;color:gray">风险级别  :</span>
    <el-select placeholder="请选择" v-model="temp.grade" class="filter-item" style="width: 15%;">
      <el-option label="一级风险" value="1">
      </el-option>
      <el-option label="二级风险" value="2">
      </el-option>
      <el-option label="三级风险" value="3">
      </el-option>
    </el-select>

    <el-button style="float:right" @click="resetTemp" type="primary" icon="el-icon-refresh">
      重置
    </el-button>
    <el-button style="float:right" type="primary" icon="el-icon-refresh" @click="getsel">
      查询
    </el-button>


    <!-- <div style="width: 40%;height: 500px;margin-left:250px;" id="main"></div>-->

    <div class="pie">
      <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
      <div id="main1" style="margin-left:250px;;width:50%;height: 500px"></div>
    </div>
  </div>


</template>

<script>
  //先要导入依赖的实例
  import echarts from 'echarts'
  import {deptOptions, postOptions, getsel, getselCondition, listPostRisk} from '@/api/sys/postrisk'
  import waves from '@/directive/waves'

  export default {
    name: "risk",
    data() {
      return {
        temp: {
          year: '',
          grade: '',
          did: ''
        },
        deptOptions: [],


        dataValue: null,
        data1: [
          /*{value:50, name:1,id:3},
          {value:50, name:2,id:3}*/
        ],
        option: {
          title: {
            text: '风险事件触发量',//主标题
            subtext: '暂无',//副标题
            x: 'center',//x轴方向对齐方式
          },
          tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
          },
          legend: {
            orient: 'vertical',
            bottom: 'bottom',
            data: ['张一', '张二', '张三']
          },
          series: [
            {
              name: '访问来源',
              type: 'pie',
              radius: '55%',
              center: ['50%', '60%'],

              data: this.data1,

              itemStyle: {
                emphasis: {
                  shadowBlur: 10,
                  shadowOffsetX: 0,
                  shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
              }
            }
          ],

        }

      }
    },
    created() {
      console.log('进入created')
      deptOptions().then(rep => {
        this.deptOptions = rep.data.items
      })
      this.getsel()
    },

    mounted() {

      this.initData();
    },

    methods: {
      // 去后台取数据的  当前的数据
      getsel() {
        // 开始转圈圈
        this.$nextTick(function () {
          // debugger // 调试
          console.log(this.temp)
          listPostRisk(this.temp).then(response => {
            this.data1 = [],
              this.postarr = response.data.items
            console.log(response.data.items)
            for (var i = 0; i < response.data.items.length; i++) {
              var obj = new Object();
              if (response.data.items[i].grade === 1) {
                obj.name = '一级风险';
              } else if (response.data.items[i].grade === 2) {
                obj.name = '二级风险';
              } else if (response.data.items[i].grade === 3) {
                obj.name = '三级风险';
              }
              /* obj.name=response.data.items[i].riskLevel;*/
              console.log(response.data.items[i])
              obj.value = response.data.items[i].riskValue;
              this.data1[i] = obj;
            }
            console.log(this.data1)
            this.option.series[0].data = this.data1
            // 转圈圈结束
          })
        })
      },
      resetTemp() {
        this.temp.year = '',
          this.temp.grade = '',
          this.temp.did = '',
          this.getsel();
      },
      //初始化数据
      initData() {
        console.log(this.data1)
        // 基于准备好的dom，初始化echarts实例
        this.chart = this.$echarts.init(document.getElementById('main1'));
        // 绘制图表
        this.chart.setOption(this.option, true);
      },
      handleChange(year) {
        this.dataValue = year;
      },
    },
    watch: {
      option: {
        handler(newVal, oldVal) {
          if (this.chart) {
            if (newVal) {
              this.chart.setOption(newVal, true)
            } else {
              this.chart.setOption(oldVal, true)
            }
          } else {
            this.initData()
          }
        },
        deep: true
      }
    }
  }
</script>


<style scoped>

</style>
