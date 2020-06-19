package com.xr.smoke.mapper;

import com.xr.smoke.entity.Duty;
import com.xr.smoke.entity.DutyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DutyMapper {
    long countByExample(DutyExample example);

    int deleteByExample(DutyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Duty record);

    int insertSelective(Duty record);

    List<Duty> selectByExample(DutyExample example);

    Duty selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Duty record, @Param("example") DutyExample example);

    int updateByExample(@Param("record") Duty record, @Param("example") DutyExample example);

    int updateByPrimaryKeySelective(Duty record);

    int updateByPrimaryKey(Duty record);
}