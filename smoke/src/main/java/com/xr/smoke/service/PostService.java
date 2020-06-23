package com.xr.smoke.service;

import com.xr.smoke.entity.Post;

import java.util.List;

public interface PostService {
    /**
     * 添加用户
     * @param
     */
    public void add(Post post);

    /**
     * 根据id删除
     * @param id
     */
    public void deleteById(Integer id);

    /**
     * 修改
     * @param
     */
    public void update(Post post);

    /**
     * 查询用户
     * @param
     * @return
     */
    public List<Post> list(Post post);

    //模糊查询分页
    public List<Post> like(String postname,Integer page,Integer limit);
}
