package com.xr.smoke.mapper;

import com.xr.smoke.entity.Deploy;
import com.xr.smoke.entity.Duty;
import com.xr.smoke.entity.DutyExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface DutyMapper {
    @Select({"<script>select * from duty where 1=1 " ,
            "<when test='!title.equals(\"\")'>",
            " and title like '%${title}%'",
            "</when>",
            "limit #{page},#{limit}",
            "</script>"})
    public List<Duty> list1(@Param("title") String title, @Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select * from duty")
    public List<Duty> list(Duty duty);

    @Insert("insert into duty(title,content,creationTime,creator,status) values (#{title},#{content},NOW(),#{creator},#{status})")
    public void add(Duty duty);

    @Delete("delete from duty where id=#{id}")
    public void delete(int id);

    @Update("update duty set title=#{title},content=#{content},creationTime=NOW(),creator=#{creator},status=#{status} where id=#{id}")
    public void update(Duty duty);

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
