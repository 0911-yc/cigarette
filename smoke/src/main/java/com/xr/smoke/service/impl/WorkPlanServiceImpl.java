package com.xr.smoke.service.impl;

import com.xr.smoke.entity.StatusEntity;
import com.xr.smoke.entity.WorkPlan;
import com.xr.smoke.mapper.WorkPlanMapper;
import com.xr.smoke.service.WorkPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkPlanServiceImpl implements WorkPlanService {
    @Autowired
    private WorkPlanMapper workPlanMapper;

    @Override
    public List<WorkPlan> list1(String title, Integer page, Integer limit) {
        List<WorkPlan> list1 = workPlanMapper.list1(title, page, limit);
        return list1;
    }

    @Override
    public void add(WorkPlan workPlan) {
        workPlanMapper.add(workPlan);
    }

    @Override
    public void delete(int id) {
        workPlanMapper.delete(id);
    }

    @Override
    public void update(WorkPlan workPlan) {
        workPlanMapper.update(workPlan);
    }

    @Override
    public List<WorkPlan> list(WorkPlan workPlan) {
        List<WorkPlan> list = workPlanMapper.list(workPlan);
        return list;
    }

    @Override
    public List<StatusEntity> groupDept(StatusEntity statusEntity) {
        List<StatusEntity> groupDept = workPlanMapper.groupDept(statusEntity);
        return groupDept;
    }
}
