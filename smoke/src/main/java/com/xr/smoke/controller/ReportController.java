package com.xr.smoke.controller;

import com.xr.smoke.entity.Report;
import com.xr.smoke.service.ReportService;
import com.xr.smoke.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("report")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @RequestMapping("list")
    public ResponseResult list(Report report,Integer page,Integer limit){
        List<Report> list = reportService.list(report);
        List<Report> list1 = reportService.list1(report.getVisitor(),report.getDefendant(), (page - 1) * limit, limit);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list1);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(Report report){
        //获取系统当前时间
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=null;
        try {
            time=sdf.parse(sdf.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        report.setCreationtime(time);
        report.setFoundcreationtime(time);
        reportService.add(report);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    public ResponseResult update(Report report){
        reportService.update(report);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    public ResponseResult delete(Integer id){
        reportService.delete(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }
}
