package com.xr.smoke.mapper;

import com.xr.smoke.entity.Deploy;
import com.xr.smoke.entity.DeployExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface DeployMapper {
    @Select({"<script>select * from deploy where 1=1 " ,
            "<when test='!title.equals(\"\")'>",
            " and title like '%${title}%'",
            "</when>",
            "limit #{page},#{limit}",
            "</script>"})
    public List<Deploy> list1(@Param("title") String title, @Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select * from deploy")
    public List<Deploy> list(Deploy deploy);

    @Insert("insert into deploy(title,content,creationTime,creator,status) values (#{title},#{content},#{creationTime},#{creator},#{status})")
    public void add(Deploy deploy);

    @Delete("delete from deploy where id=#{id}")
    public void delete(int id);

    @Update("update deploy set title=#{title},content=#{content},creationTime=#{creationTime},creator=#{creator},status=#{status} where id=#{id}")
    public void update(Deploy deploy);


    long countByExample(DeployExample example);

    int deleteByExample(DeployExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Deploy record);

    int insertSelective(Deploy record);

    List<Deploy> selectByExample(DeployExample example);

    Deploy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Deploy record, @Param("example") DeployExample example);

    int updateByExample(@Param("record") Deploy record, @Param("example") DeployExample example);

    int updateByPrimaryKeySelective(Deploy record);

    int updateByPrimaryKey(Deploy record);
}
