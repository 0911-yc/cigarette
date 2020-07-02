package com.xr.smoke.service.impl;

import com.xr.smoke.entity.Responsibility;
import com.xr.smoke.mapper.ResponsibilityMapper;
import com.xr.smoke.service.ResponsibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponsibilityServiceImpl implements ResponsibilityService {
    @Autowired
    private ResponsibilityMapper responsibilityMapper;

    @Override
    public List<Responsibility> list1(String supervisiontitle, Integer page, Integer limit) {
        List<Responsibility> list1 = responsibilityMapper.list1(supervisiontitle, page, limit);
        return list1;
    }

    @Override
    public void add(Responsibility responsibility) {

        responsibilityMapper.add(responsibility);
    }

    @Override
    public void delete(int id) {
        responsibilityMapper.delete(id);
    }

    @Override
    public void update(Responsibility responsibility) {
        responsibilityMapper.update(responsibility);
    }

    @Override
    public List<Responsibility> list(Responsibility responsibility) {
        List<Responsibility> list = responsibilityMapper.list(responsibility);
        return list;
    }

    @Override
    public void xiugai(String accessories, Integer id) {

        responsibilityMapper.xiugai(accessories,id);
    }

    @Override
    public Responsibility max() {
        return responsibilityMapper.max();
    }
    @Override
    public Responsibility tz(int id) {
        return responsibilityMapper.tz(id);
    }
}
