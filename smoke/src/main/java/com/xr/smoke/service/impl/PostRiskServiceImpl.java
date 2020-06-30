package com.xr.smoke.service.impl;

import com.xr.smoke.entity.Institution;
import com.xr.smoke.entity.Post;
import com.xr.smoke.entity.PostRisk;
import com.xr.smoke.mapper.PostRiskMapper;
import com.xr.smoke.service.PostRiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class PostRiskServiceImpl implements PostRiskService {
    @Autowired
    private PostRiskMapper postRiskMapper;

    @Override
    public List<Institution> deptsel() {
        return postRiskMapper.deptsel();
    }

    @Override
    public List<Post> postdid(Integer did) {
        return postRiskMapper.postdid(did);
    }

    @Override
    public List<Map<String, Object>> getsel() {
        return postRiskMapper.getsel();
    }

    @Override
    public List<Map<String, Object>> getselCondition(Integer did, Integer pid) {
        return postRiskMapper.getselCondition(did,pid);
    }

    @Override
    public List<PostRisk> Postselect(PostRisk postRisk) {
        return postRiskMapper.Postselect(postRisk);
    }
}
