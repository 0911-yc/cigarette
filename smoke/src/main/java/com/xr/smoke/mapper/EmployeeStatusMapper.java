package com.xr.smoke.mapper;

import com.xr.smoke.entity.EmployeeStatus;
import com.xr.smoke.entity.EmployeeStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeStatusMapper {
    long countByExample(EmployeeStatusExample example);

    int deleteByExample(EmployeeStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeStatus record);

    int insertSelective(EmployeeStatus record);

    List<EmployeeStatus> selectByExample(EmployeeStatusExample example);

    EmployeeStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmployeeStatus record, @Param("example") EmployeeStatusExample example);

    int updateByExample(@Param("record") EmployeeStatus record, @Param("example") EmployeeStatusExample example);

    int updateByPrimaryKeySelective(EmployeeStatus record);

    int updateByPrimaryKey(EmployeeStatus record);
}