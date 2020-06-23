package com.xr.smoke.controller;

import com.xr.smoke.entity.Duty;
import com.xr.smoke.service.DutyService;
import com.xr.smoke.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("duty")
public class DutyController {
    @Autowired
    private DutyService dutyService;

    @RequestMapping("list")
    public ResponseResult list(Duty duty, Integer page, Integer limit){
        List<Duty> list = dutyService.list(duty);
        List<Duty> list1 = dutyService.list1(duty.getTitle(),(page-1)*limit,limit);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list1);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(Duty duty){
        //获取系统当前时间
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=null;
        try {
            time=sdf.parse(sdf.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        duty.setCreationTime(time);
        dutyService.add(duty);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    public ResponseResult update(Duty duty){
        dutyService.update(duty);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    public ResponseResult delete(int id){
        dutyService.delete(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }
}
