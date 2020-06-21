package com.xr.smoke.mapper;

import com.xr.smoke.entity.PoliticianTalk;
import com.xr.smoke.entity.PoliticianTalkExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliticianTalkMapper {
    @Select({"<script>select p.id id,talkType,talkcreationTime,talkSite,s.status status from politicianTalk p,status s where p.status = s.id and 1=1 " ,
            "<when test='!talkType.equals(\"\")'>",
            " and talkType like '%${talkType}%' ",
            "</when>",
            "limit #{page},#{limit}",
            "</script>"})
    public List<PoliticianTalk> list1(@Param("talkType") String talkType, @Param("page") Integer page, @Param("limit") Integer limit);

//    @Select("select * from politicianTalk")
    @Select("select p.id id,talkType,talkcreationTime,talkSite,s.status status from politicianTalk p,status s where p.status = s.id")
    public List<PoliticianTalk> list(PoliticianTalk politicianTalk);

    @Insert("insert into politicianTalk(talkName,talkDempartment,talkPoliticsStatus,talkDuty,talkType,talkcreationTime,talkSite,talkPerson,talkOutline,talkContent,datacreationTime,creator,status) values (#{talkName},#{talkDempartment},#{talkPoliticsStatus},#{talkDuty},#{talkType},#{talkcreationTime},#{talkSite},#{talkPerson},#{talkOutline},#{talkContent},#{datacreationTime},#{creator},#{status})")
    public void add(PoliticianTalk politicianTalk);

    @Delete("delete from politicianTalk where id=#{id}")
    public void delete(int id);

    @Update("update politicianTalk set talkName=#{talkName},talkDempartment=#{talkDempartment},talkPoliticsStatus=#{talkPoliticsStatus},talkDuty=#{talkDuty},talkType=#{talkType},talkcreationTime=#{talkcreationTime},talkSite=#{talkSite},talkPerson=#{talkPerson},talkOutline=#{talkOutline},talkContent=#{talkContent},datacreationTime=#{datacreationTime},creator=#{creator},status=#{status} where id=#{id}")
    public void update(PoliticianTalk politicianTalk);

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
