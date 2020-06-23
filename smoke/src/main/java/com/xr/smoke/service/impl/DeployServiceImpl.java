package com.xr.smoke.service.impl;

import com.xr.smoke.entity.Deploy;
import com.xr.smoke.mapper.DeployMapper;
import com.xr.smoke.service.DeployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeployServiceImpl implements DeployService {
    @Autowired
    private DeployMapper deployMapper;

    @Override
    public List<Deploy> list1(String title, Integer page, Integer limit) {
        List<Deploy> list1 = deployMapper.list1(title, page, limit);
        return list1;
    }

    @Override
    public void add(Deploy deploy) {
        deployMapper.add(deploy);
    }

    @Override
    public void delete(int id) {
        deployMapper.delete(id);
    }

    @Override
    public void update(Deploy deploy) {
        deployMapper.update(deploy);
    }

    @Override
    public List<Deploy> list(Deploy deploy) {
        List<Deploy> list = deployMapper.list(deploy);
        return list;
    }
}
