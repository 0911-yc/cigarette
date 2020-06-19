package com.xr.smoke.mapper;

import com.xr.smoke.entity.RiskAssessment;
import com.xr.smoke.entity.RiskAssessmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskAssessmentMapper {
    long countByExample(RiskAssessmentExample example);

    int deleteByExample(RiskAssessmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RiskAssessment record);

    int insertSelective(RiskAssessment record);

    List<RiskAssessment> selectByExample(RiskAssessmentExample example);

    RiskAssessment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RiskAssessment record, @Param("example") RiskAssessmentExample example);

    int updateByExample(@Param("record") RiskAssessment record, @Param("example") RiskAssessmentExample example);

    int updateByPrimaryKeySelective(RiskAssessment record);

    int updateByPrimaryKey(RiskAssessment record);
}