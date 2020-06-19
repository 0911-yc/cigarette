package com.xr.smoke.mapper;

import com.xr.smoke.entity.PoliticsStatus;
import com.xr.smoke.entity.PoliticsStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoliticsStatusMapper {
    long countByExample(PoliticsStatusExample example);

    int deleteByExample(PoliticsStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsStatus record);

    int insertSelective(PoliticsStatus record);

    List<PoliticsStatus> selectByExample(PoliticsStatusExample example);

    PoliticsStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoliticsStatus record, @Param("example") PoliticsStatusExample example);

    int updateByExample(@Param("record") PoliticsStatus record, @Param("example") PoliticsStatusExample example);

    int updateByPrimaryKeySelective(PoliticsStatus record);

    int updateByPrimaryKey(PoliticsStatus record);
}