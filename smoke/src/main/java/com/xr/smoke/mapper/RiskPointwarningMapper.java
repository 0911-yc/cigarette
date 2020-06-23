package com.xr.smoke.mapper;

import com.xr.smoke.entity.RiskPointwarning;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RiskPointwarningMapper {

    @Select({"<script>SELECT id,number,title,content,createtime,aid,createName,status from riskPointwarning where 1=1" ,
            "<when test='title!=null'>",
            " and title like '%${title}%'",
            "</when>",
            "<when test='content!=null'>",
            " and content like '%${content}%'",
            "</when>",
            "ORDER BY id desc",
            "limit #{page},#{limit}",
            "</script>"})
    public List<RiskPointwarning> list1(@Param("title") String title,@Param("content") String content, @Param("page") Integer page, @Param("limit") Integer limit);

    //查询所有风险点预警管理的信息
    @Select("SELECT id,number,title,content,createtime,aid,createName,status from riskPointwarning")
    List<RiskPointwarning> list(RiskPointwarning riskPointwarning);

    //添加风险点预警管理信息
    @Insert("INSERT into riskPointwarning(number,title,content,createtime,aid,createName,status) VALUES(#{number},#{title},#{content},NOW(),1,#{createName},1)")
    void add(RiskPointwarning riskPointwarning);

    //删除风险点预警管理信息
    @Delete("delete from riskPointwarning where id=#{id}")
    void delete(Integer id);

    @Update("UPDATE riskPointwarning set number=#{number},title=#{title},content=#{content},createtime=NOW(),aid=#{aid},createName=#{createName},status=#{status} where id=#{id}")
    void update(RiskPointwarning riskPointwarning);

}
