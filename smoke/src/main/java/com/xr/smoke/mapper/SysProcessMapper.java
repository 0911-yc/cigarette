package com.xr.smoke.mapper;

import com.xr.smoke.entity.SysProcess;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysProcessMapper {

    @Select({"<script>select id,title,content,createtime,aid,createName,status from sysprocess where 1=1" ,
            "<when test='title!=null'>",
            " and title like '%${title}%'",
            "</when>",
            "<when test='content!=null'>",
            " and content like '%${content}%'",
            "</when>",
            "ORDER BY id desc",
            "limit #{page},#{limit}",
            "</script>"})
    public List<SysProcess> list1(@Param("title") String title, @Param("content") String content, @Param("page") Integer page, @Param("limit") Integer limit);

    //查询所有风险点预警管理的信息
    @Select("select r.id,title,content,createtime,aid,createName,s.state from sysprocess r,state s where r.status=s.id")
    List<SysProcess> list(SysProcess sysProcess);

    //添加风险点预警管理信息
    @Insert("INSERT into sysprocess(title,content,createtime,aid,createName,status) VALUES(#{title},#{content},NOW(),1,#{createName},1)")
    void add(SysProcess sysProcess);

    //删除风险点预警管理信息
    @Delete("delete from sysprocess where id=#{id}")
    void delete(Integer id);

    @Update("UPDATE sysprocess set title=#{title},content=#{content},status=#{status} where id=#{id}")
    void update(SysProcess sysProcess);
}
