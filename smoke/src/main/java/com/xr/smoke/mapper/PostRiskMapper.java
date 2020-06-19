package com.xr.smoke.mapper;

import com.xr.smoke.entity.PostRisk;
import com.xr.smoke.entity.PostRiskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostRiskMapper {
    long countByExample(PostRiskExample example);

    int deleteByExample(PostRiskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PostRisk record);

    int insertSelective(PostRisk record);

    List<PostRisk> selectByExample(PostRiskExample example);

    PostRisk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PostRisk record, @Param("example") PostRiskExample example);

    int updateByExample(@Param("record") PostRisk record, @Param("example") PostRiskExample example);

    int updateByPrimaryKeySelective(PostRisk record);

    int updateByPrimaryKey(PostRisk record);
}