package com.xr.smoke.service.impl;

import com.xr.smoke.entity.Duty;
import com.xr.smoke.mapper.DutyMapper;
import com.xr.smoke.service.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DutyServiceImpl implements DutyService {
    @Autowired
    private DutyMapper dutyMapper;

    @Override
    public List<Duty> list1(String title, Integer page, Integer limit) {
        List<Duty> list1 = dutyMapper.list1(title, page, limit);
        return list1;
    }

    @Override
    public void add(Duty duty) {
        dutyMapper.add(duty);
    }

    @Override
    public void delete(int id) {
        dutyMapper.delete(id);
    }

    @Override
    public void update(Duty duty) {
        dutyMapper.update(duty);
    }

    @Override
    public List<Duty> list(Duty duty) {
        List<Duty> list = dutyMapper.list(duty);
        return list;
    }
}
