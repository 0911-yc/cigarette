package com.xr.smoke.mapper;

import com.xr.smoke.entity.StatusEntity;
import com.xr.smoke.entity.WorkPlan;
import com.xr.smoke.entity.WorkPlanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkPlanMapper {
    @Select({"<script>select w.id id,title,content,creationTime,creator,s.status statuse from workPlan w,status s where w.statuse =s.id and 1=1 " ,
            "<when test='!title.equals(\"\")'>",
            " and title like '%${title}%' ",
            "</when>",
            "limit #{page},#{limit}",
            "</script>"})
    public List<WorkPlan> list1(@Param("title") String title, @Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select w.id id,title,content,creationTime,creator,s.status statuse from workPlan w,status s where w.statuse=s.id")
    public List<WorkPlan> list(WorkPlan workPlan);

    @Insert("insert into workPlan(title,content,creationTime,creator,statuse) values (#{title},#{content},NOW(),#{creator},1)")
    public void add(WorkPlan workPlan);

    @Delete("delete from workPlan where id=#{id}")
    public void delete(int id);

    @Update("update workPlan set title=#{title},content=#{content},creationTime=NOW(),creator=#{creator},statuse=#{statuse} where id=#{id}")
    public void update(WorkPlan workPlan);

    @Select("select id,status from status")
    public List<StatusEntity> groupDept(StatusEntity statusEntity);

    long countByExample(WorkPlanExample example);

    int deleteByExample(WorkPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkPlan record);

    int insertSelective(WorkPlan record);

    List<WorkPlan> selectByExample(WorkPlanExample example);

    WorkPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkPlan record, @Param("example") WorkPlanExample example);

    int updateByExample(@Param("record") WorkPlan record, @Param("example") WorkPlanExample example);

    int updateByPrimaryKeySelective(WorkPlan record);

    int updateByPrimaryKey(WorkPlan record);
}
