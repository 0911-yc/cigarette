package com.xr.smoke.service;


import com.xr.smoke.entity.Responsibility;

import java.util.List;

public interface ResponsibilityService {
    public List<Responsibility> list1(String supervisiontitle, Integer page, Integer limit);
    public void add(Responsibility responsibility);
    public void delete(int id);
    public void update(Responsibility responsibility);
    public List<Responsibility> list(Responsibility responsibility);
    public void xiugai(String accessories, Integer id);
    public Responsibility max();
    public Responsibility tz(int id);
}
