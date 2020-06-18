package com.xr.smoke.mapper;

import com.xr.smoke.entity.PoliticianTalk;
import com.xr.smoke.entity.PoliticianTalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoliticianTalkMapper {
    long countByExample(PoliticianTalkExample example);

    int deleteByExample(PoliticianTalkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoliticianTalk record);

    int insertSelective(PoliticianTalk record);

    List<PoliticianTalk> selectByExample(PoliticianTalkExample example);

    PoliticianTalk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoliticianTalk record, @Param("example") PoliticianTalkExample example);

    int updateByExample(@Param("record") PoliticianTalk record, @Param("example") PoliticianTalkExample example);

    int updateByPrimaryKeySelective(PoliticianTalk record);

    int updateByPrimaryKey(PoliticianTalk record);
}