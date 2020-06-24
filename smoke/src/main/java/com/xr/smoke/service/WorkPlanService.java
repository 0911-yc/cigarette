package com.xr.smoke.service;

import com.xr.smoke.entity.StatusEntity;
import com.xr.smoke.entity.WorkPlan;

import java.util.List;

public interface WorkPlanService {
    public List<WorkPlan> list1(String title, Integer page, Integer limit);
    public void add(WorkPlan workPlan);
    public void delete(int id);
    public void update(WorkPlan workPlan);
    public List<WorkPlan> list(WorkPlan workPlan);
    public List<StatusEntity> groupDept(StatusEntity statusEntity);
}
