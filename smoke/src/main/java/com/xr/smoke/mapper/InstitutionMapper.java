package com.xr.smoke.mapper;

import com.xr.smoke.entity.Institution;
import com.xr.smoke.entity.InstitutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionMapper {
    long countByExample(InstitutionExample example);

    int deleteByExample(InstitutionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Institution record);

    int insertSelective(Institution record);

    //List<Institution> selectByExample(InstitutionExample example);

    Institution selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Institution record, @Param("example") InstitutionExample example);

    int updateByExample(@Param("record") Institution record, @Param("example") InstitutionExample example);

    int updateByPrimaryKeySelective(Institution record);

    int updateByPrimaryKey(Institution record);

    @Select("select id,departmentID,departmentName,departmentHead,divisionalManagement,leader,creationTime,currentId,currentName,departmentState from institution")
    public List<Institution> list();
}