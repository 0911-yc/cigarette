package com.xr.smoke.controller;

import com.xr.smoke.entity.Responsibility;
import com.xr.smoke.service.ResponsibilityService;
import com.xr.smoke.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("resp")
public class ResponsibilityController {
    @Autowired
    private ResponsibilityService responsibilityService;

    @RequestMapping("list")
    public ResponseResult list(Responsibility responsibility, Integer page, Integer limit){
        List<Responsibility> list = responsibilityService.list(responsibility);
        List<Responsibility> list1 = responsibilityService.list1(responsibility.getSupervisiontitle(),(page-1)*limit,limit);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list1);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(Responsibility responsibility){
        //获取系统当前时间
        String timestamp = new String(String.valueOf(System.currentTimeMillis()));
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=null;
        try {
            time=sdf.parse(sdf.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        responsibility.setSupervisionid(timestamp);
        responsibility.setCreationTime(time);
        responsibilityService.add(responsibility);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    public ResponseResult update(Responsibility responsibility){
        responsibilityService.update(responsibility);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    public ResponseResult delete(int id){
        responsibilityService.delete(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }
}
