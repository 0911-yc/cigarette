package com.xr.smoke.service;


import com.xr.smoke.entity.Duty;

import java.util.List;

public interface DutyService {
    public List<Duty> list1(String title, Integer page, Integer limit);
    public void add(Duty duty);
    public void delete(int id);
    public void update(Duty duty);
    public List<Duty> list(Duty duty);
}
