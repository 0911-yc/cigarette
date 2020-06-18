package com.xr.smoke.mapper;

import com.xr.smoke.entity.Deploy;
import com.xr.smoke.entity.DeployExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeployMapper {
    long countByExample(DeployExample example);

    int deleteByExample(DeployExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Deploy record);

    int insertSelective(Deploy record);

    List<Deploy> selectByExample(DeployExample example);

    Deploy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Deploy record, @Param("example") DeployExample example);

    int updateByExample(@Param("record") Deploy record, @Param("example") DeployExample example);

    int updateByPrimaryKeySelective(Deploy record);

    int updateByPrimaryKey(Deploy record);
}