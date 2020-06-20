package com.xr.smoke.mapper;

import com.xr.smoke.entity.Report;
import com.xr.smoke.entity.ReportExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportMapper {

    @Select({"<script>select id,creationTime,visitor,visitorDepartment,visitPost,defendant,defendantDepartment,defendantPost,visitContent,visitDigest,departmentOpinion,signingcreationTime,foundcreationTime,creator,state from report where 1=1" ,
            "<when test='visitor!=null'>",
            " and visitor like '%${visitor}%'",
            "</when>",
            "<when test='defendant!=null'>",
            " and defendant like '%${defendant}%'",
            "</when>",
            "ORDER BY id desc",
            "limit #{page},#{limit}",
            "</script>"})
    public List<Report> list1(@Param("visitor") String visitor,@Param("defendant") String defendant, @Param("page") Integer page, @Param("limit") Integer limit);

    //查询所有的举报信息
    @Select("select id,creationTime,visitor,visitorDepartment,visitPost,defendant,defendantDepartment,defendantPost,visitContent,visitDigest,departmentOpinion,signingcreationTime,foundcreationTime,creator,state from report ORDER BY id desc")
    public List<Report> list(Report report);

    //添加举报信息
    @Insert("insert into report(creationTime,visitor,visitorDepartment,visitPost,defendant,defendantDepartment,defendantPost,visitContent,visitDigest,foundcreationTime,state)\n" +
            "VALUES (NOW(),#{visitor},#{visitordepartment},#{visitpost},#{defendant},#{defendantdepartment},#{defendantpost},#{visitcontent},#{visitdigest},NOW(),1)")
    public void add(Report report);

    //删除举报信息
    @Delete("delete from report where id=#{id}")
    public void delete(Integer id);

    //修改举报信息
    //signingcreationTime=NOW(),groupSigningcreationTime=NOW(),leaderSigningcreationTime=NOW(),departmentReultcreationTime=NOW(),datecreationTime=NOW()
    @Update("UPDATE report SET visitor=#{visitor},visitorDepartment=#{visitordepartment},visitPost=#{visitpost},defendant=#{defendant},defendantDepartment=#{defendantdepartment},defendantPost=#{defendantpost},visitContent=#{visitcontent},visitDigest=#{visitdigest} WHERE id=#{id}")
    public void update(Report report);

    long countByExample(ReportExample example);

    int deleteByExample(ReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Report record);

    int insertSelective(Report record);

    List<Report> selectByExample(ReportExample example);

    Report selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByExample(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);
}