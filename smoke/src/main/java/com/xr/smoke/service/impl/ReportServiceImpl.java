package com.xr.smoke.service.impl;

import com.xr.smoke.entity.Report;
import com.xr.smoke.mapper.ReportMapper;
import com.xr.smoke.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportMapper reportMapper;

    @Override
    public List<Report> list1(String visitor,String defendant, Integer page, Integer limit) {
        return reportMapper.list1(visitor,defendant,page,limit);
    }

    @Override
    public List<Report> list(Report report) {
        return reportMapper.list(report);
    }

    @Override
    public void add(Report report) {
        reportMapper.add(report);
    }

    @Override
    public void delete(Integer id) {
        reportMapper.delete(id);
    }

    @Override
    public void update(Report report) {
        reportMapper.update(report);
    }
}
