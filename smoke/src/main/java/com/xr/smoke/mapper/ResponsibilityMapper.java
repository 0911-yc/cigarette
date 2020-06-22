package com.xr.smoke.mapper;

import com.xr.smoke.entity.Responsibility;
import com.xr.smoke.entity.WorkPlan;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResponsibilityMapper {
    @Select({"<script>select * from responsibility where 1=1 " ,
            "<when test='!supervisiontitle.equals(\"\")'>",
            " and supervisiontitle like '%${supervisiontitle}%' ",
            "</when>",
            "limit #{page},#{limit}",
            "</script>"})
    public List<Responsibility> list1(@Param("supervisiontitle") String supervisiontitle, @Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select * from responsibility")
    public List<Responsibility> list(Responsibility responsibility);

    @Insert("insert into responsibility(supervisionid,supervisiontype,supervisiontitle,supervisioncontent,departmentid,accessories,creationTime,creator,status) values (#{supervisionid},#{supervisiontype},#{supervisiontitle},#{supervisioncontent},#{departmentid},#{accessories},NOW(),#{creator},#{status})")
    public void add(Responsibility responsibility);

    @Delete("delete from responsibility where id=#{id}")
    public void delete(int id);

    @Update("update responsibility set supervisionid=#{supervisionid},supervisiontype=#{supervisiontype},supervisiontitle=#{supervisiontitle},supervisioncontent=#{supervisioncontent},departmentid=#{departmentid},accessories=#{accessories},creationTime=NOW(),creator=#{creator},status=#{status} where id=#{id}")
    public void update(Responsibility responsibility);
}
