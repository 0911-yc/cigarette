package com.xr.smoke.service;

import com.xr.smoke.entity.Report;

import java.util.List;

public interface ReportService {

    public List<Report> list1(String visitor, String defendant, Integer page, Integer limit);
    public List<Report> list(Report report);
    public void add(Report report);
    public void delete(Integer id);
    public void update(Report report);
}
