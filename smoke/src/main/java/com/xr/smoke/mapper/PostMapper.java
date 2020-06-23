package com.xr.smoke.mapper;

import com.xr.smoke.entity.Post;
import com.xr.smoke.entity.PostExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface PostMapper {
    long countByExample(PostExample example);

    int deleteByExample(PostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Post record);

    int insertSelective(Post record);

    List<Post> selectByExample(PostExample example);

    Post selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Post record, @Param("example") PostExample example);

    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);

    //查询
   @Select("select id,postId,postName,time,creator,postStatus from post")
   List<Post> list(Post post);

    //添加
    @Insert("insert into post(id,postId,postName,time,creator,postStatus) values(null,#{postid},#{postname},NOW(),'admin',#{poststatus})")
    void add(Post post);

    //修改
    @Update("update post set postName=#{postname},postStatus=#{poststatus} where id=#{id}")
    void update(Post post);

    //模糊查询加分页
    @Select({"<script>SELECT id,postId,postName,time,creator,postStatus from post where 1=1" ,
            "<when test='postname!=null'>",
            " and postName like '%${postname}%'",
            "</when>",
            "ORDER BY id desc",
            "limit #{page},#{limit}",
            "</script>"})
    List<Post> like(@Param("postname") String title, @Param("page") Integer page, @Param("limit") Integer limit);
}