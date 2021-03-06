package com.xr.smoke.mapper;

import com.xr.smoke.entity.Institution;
import com.xr.smoke.entity.Post;
import com.xr.smoke.entity.PostRisk;
import com.xr.smoke.entity.PostRiskExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRiskMapper {

    /**
     * 部门查询
     *
     * @return
     */
    @Select("select id,departmentName from institution")
    List<Institution> deptsel();

    /**
     * 通过部门id查询岗位
     *
     * @param did
     * @return
     */
    @Select("select id,postName from post where did=#{did}")
    List<Post> postdid(@Param("did") Integer did);

    /**
     * 获得岗位风险点评价的数据(查询所有)
     *
     * @return
     */
    @Select("select date_format(creationTime,'%Y') creationTime,risk_value riskValue,grade,count(grade) sum from postRisk group by risk_value,grade,date_format(creationTime,'%Y')")
    List<Map<String, Object>> getsel();

    /**
     * 获得岗位风险点评价的数据(条件查询)
     *
     * @return
     */
    @Select({"<script>",
            "select date_format(creationTime,'%Y') creationTime,grade,count(grade) sum from postRisk where 1=1" ,
            "<when test='did!=null'>",
            " and did=#{did}",
            "</when>",
            "<when test='pid!=null'>",
            " and pid=#{pid}",
            "</when>",
            "group by grade,date_format(creationTime,'%Y')",
            "</script>"})
    List<Map<String, Object>> getselCondition(@Param("did") Integer did, @Param("pid") Integer pid);

    /**
     * 查询风险占比分析的数据
     * @param postRisk
     * @return
     * <when test='postRisk.year!=null'>",
     *             "and year regexp '${postRisk.year}'",
     *             "</when>",
     *             "<when test='postRisk.did!=null'>",
     *             "and did = '${postRisk.did}'",
     *             "</when>",
     *             "<when test='postRisk.grade!=null'>",
     *             "and grade = '${postRisk.grade}'",
     *             "</when>
     */
    @Select({"<script>",
            "SELECT risk_value riskValue,grade,count(grade) sum FROM postRisk WHERE 1=1 ",
            "<when test='postRisk.year!=null'>",
            "and year regexp '${postRisk.year}'",
            "</when>",
            "<when test='postRisk.did!=null'>",
            "and did=#{did}'",
            "</when>",
            "<when test='postRisk.grade!=null'>",
            "and grade=#{grade}'",
            "</when>",
            "group by grade,risk_value",
            "</script>"})
    List<PostRisk> Postselect(@Param("postRisk") PostRisk postRisk);
}