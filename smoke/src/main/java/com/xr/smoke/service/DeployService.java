package com.xr.smoke.service;

import com.xr.smoke.entity.Deploy;

import java.util.List;

public interface DeployService {
    public List<Deploy> list1(String title, Integer page, Integer limit);
    public void add(Deploy deploy);
    public void delete(int id);
    public void update(Deploy deploy);
    public List<Deploy> list(Deploy deploy);
}
