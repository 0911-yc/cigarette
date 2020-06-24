<template>
  <div class="app-container">
    <el-tabs v-model="activeName" type="card" @tab-click="handleClick">
      <el-tab-pane label="横向视图" name="first">横向视图</el-tab-pane>
      <el-tab-pane label="纵向视图" name="second">纵向视图</el-tab-pane>
    </el-tabs>
  </div>
</template>

<script>
  export default {
    name: "proportion",
    data() {
      return {
        activeName: 'first'
      };
    },
    methods: {
      handleClick(tab, event) {
        console.log(tab, event);
      }
    }
  }
</script>

<style scoped>

</style>
