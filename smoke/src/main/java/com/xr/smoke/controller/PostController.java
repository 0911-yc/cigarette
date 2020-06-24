package com.xr.smoke.controller;

import com.xr.smoke.entity.Post;
import com.xr.smoke.service.PostService;
import com.xr.smoke.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping("list")
    public ResponseResult list(Post post,Integer page,Integer limit){
        List<Post> list = postService.list(post);
        List<Post> like = postService.like(post.getPostname(), (page - 1) * limit, limit);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",like);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(Post post){
        String timestamp = new String(String.valueOf(System.currentTimeMillis()));
        post.setPostid(timestamp);
        postService.add(post);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    public ResponseResult update(Post post){
        postService.update(post);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    public ResponseResult delete(int id){
        postService.deleteById(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }
}
