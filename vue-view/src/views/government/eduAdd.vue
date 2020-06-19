<template>
    <div class="app-container">
      <div class="filter-container">
        <span style="margin-left: 30%">资讯标题</span>
        <el-input placeholder="请输入资讯标题" style="width: 200px;" class="filter-item"/>
        <br/>
        <span style="margin-left: 30%">资讯来源</span>
        <el-input placeholder="请输入资讯来源" style="width: 200px;" class="filter-item"/>
        <br/>
        <span style="margin-left: 30%">资讯类型</span>
        <el-select placeholder="请选择资讯类型" style="width: 200px;" class="filter-item">
          <el-option></el-option>
        </el-select>
        <br/>
        <span style="margin-left: 27.6%">资讯发布时间</span>
        <el-date-picker style="width: 200px;" class="filter-item"></el-date-picker>
        <br/>
        <span style="margin-left: 29%">创建者姓名</span>
        <el-input readonly="readonly" style="width: 200px;" class="filter-item"/>
        <br/>
        <span style="margin-left: 30%">创建时间</span>
        <el-input readonly="readonly" style="width: 200px;" class="filter-item"/>
        <br/>
        <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate">
          添加
        </el-button>

        <el-button style="margin-left: 50%" class="filter-item" type="primary" icon="el-icon-search" @click="getList">
          查询
        </el-button>
        <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate">
          重置
        </el-button>
      </div>
    </div>
</template>

<script>
    export default {
        name: "eduAdd",
    }
</script>

<style scoped>

</style>
