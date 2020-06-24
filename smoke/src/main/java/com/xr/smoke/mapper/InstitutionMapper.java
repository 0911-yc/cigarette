package com.xr.smoke.mapper;

import com.xr.smoke.entity.Institution;
import com.xr.smoke.entity.InstitutionExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionMapper {
    long countByExample(InstitutionExample example);

    int deleteByExample(InstitutionExample example);

    int deleteByPrimaryKey(Integer id);

    //int insert(Institution record);

    int insertSelective(Institution record);

    List<Institution> selectByExample(InstitutionExample example);

    Institution selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Institution record, @Param("example") InstitutionExample example);

    int updateByExample(@Param("record") Institution record, @Param("example") InstitutionExample example);

    int updateByPrimaryKeySelective(Institution record);

    int updateByPrimaryKey(Institution record);

//    @Select(" select i.id,departmentID,departmentName,departmentHead,divisionalManagement,leader,creationTime,currentId,currentName,departmentState,s.state from institution i,state s WHERE i.departmentState=s.id")
    public List<Institution> list();

    @Update("update  institution set departmentid=#{departmentid},departmenthead=#{departmenthead},leader=#{leader},departmentstate=#{departmentstate},departmentname=#{departmentname} where id=#{id}")
    void update(Institution institution);

    @Insert("insert into institution(id,departmentID,departmentName,departmentHead,divisionalManagement,leader,creationTime,currentId,currentName,departmentState) values(NULL,#{departmentid},#{departmentname},#{departmenthead},2,#{leader},NOW(),1,'admin',1)")
    void add(Institution institution);

    @Select({"<script>SELECT id,departmentID,departmentName,departmentHead,leader,creationTime,currentName,departmentState from institution where 1=1" ,
            "<when test='departmenthead!=null'>",
            " and departmentHead like '%${departmenthead}%'",
            "</when>",
            "ORDER BY id desc",
            "limit #{page},#{limit}",
            "</script>"})
    List<Institution> list1(@Param("departmenthead") String title, @Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select * from institution")
    List<Institution> list(Institution institution);
}