<template>
  <div class="dashboard-container" align="center">
<!--    <component :is="currentRole" />-->
    <el-carousel :interval="4000" type="card" height="200px">
<!--      <el-carousel-item v-for="item in 6" :key="item">-->
<!--        <h3 class="medium">{{ item }}</h3>-->
<!--      </el-carousel-item>-->
      <el-carousel-item>
        <h3>党风廉政建设</h3>
      </el-carousel-item>
      <el-carousel-item>
        <h3>党风廉政建设</h3>
      </el-carousel-item>
      <el-carousel-item>
        <h3>党风廉政建设</h3>
      </el-carousel-item>
      <el-carousel-item>
        <h3>党风廉政建设</h3>
      </el-carousel-item>
      <el-carousel-item>
        <h3>党风廉政建设</h3>
      </el-carousel-item>
    </el-carousel>
  </div>
</template>

<script>
import { mapGetters } from 'vuex'
// import adminDashboard from './admin'
// import editorDashboard from './editor'

export default {
  name: 'Dashboard',
  // components: { adminDashboard, editorDashboard },
  data() {
    return {
      currentRole: 'adminDashboard'
    }
  },
  computed: {
    ...mapGetters([
      'roles'
    ])
  },
  created() {
    if (!this.roles.includes('admin')) {
      this.currentRole = 'editorDashboard'
    }
  }
}
</script>

<style>
  .el-carousel__item h3 {
    color: #475669;
    font-size: 20px;
    opacity: 0.75;
    line-height: 300px;
    margin: 0;
  }

  .el-carousel__item:nth-child(2n) {
    background-color: #99a9bf;
  }

  .el-carousel__item:nth-child(2n+1) {
    background-color: #d3dce6;
  }
</style>
