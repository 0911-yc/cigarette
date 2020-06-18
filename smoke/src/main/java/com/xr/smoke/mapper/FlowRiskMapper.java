package com.xr.smoke.mapper;

import com.xr.smoke.entity.FlowRisk;
import com.xr.smoke.entity.FlowRiskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowRiskMapper {
    long countByExample(FlowRiskExample example);

    int deleteByExample(FlowRiskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FlowRisk record);

    int insertSelective(FlowRisk record);

    List<FlowRisk> selectByExample(FlowRiskExample example);

    FlowRisk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FlowRisk record, @Param("example") FlowRiskExample example);

    int updateByExample(@Param("record") FlowRisk record, @Param("example") FlowRiskExample example);

    int updateByPrimaryKeySelective(FlowRisk record);

    int updateByPrimaryKey(FlowRisk record);
}