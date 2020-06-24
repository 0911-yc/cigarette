package com.xr.smoke.service.impl;

import com.xr.smoke.entity.Post;
import com.xr.smoke.mapper.PostMapper;
import com.xr.smoke.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostMapper postMapper;

    @Override
    public void add(Post post) {
        postMapper.add(post);
    }

    @Override
    public void deleteById(Integer id) {
        postMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Post post) {
        postMapper.update(post);
    }

    @Override
    public List<Post> like(String postname, Integer page, Integer limit) {
        return postMapper.like(postname,page,limit);
    }

    @Override
    public List<Post> list(Post post) {
        return postMapper.list(post);
    }
}
