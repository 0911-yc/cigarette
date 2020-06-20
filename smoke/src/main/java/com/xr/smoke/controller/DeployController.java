package com.xr.smoke.controller;

import com.xr.smoke.entity.Deploy;
import com.xr.smoke.service.DeployService;
import com.xr.smoke.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("deploy")
public class DeployController {
    @Autowired
    private DeployService deployService;

    @RequestMapping("list")
    public ResponseResult list(Deploy deploy, Integer page, Integer limit){
        List<Deploy> list = deployService.list(deploy);
        List<Deploy> list1 = deployService.list1(deploy.getTitle(),(page-1)*limit,limit);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list1);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(Deploy deploy){
        //获取系统当前时间
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=null;
        try {
            time=sdf.parse(sdf.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        deploy.setCreationTime(time);
        deployService.add(deploy);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    public ResponseResult update(Deploy deploy){
        deployService.update(deploy);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    public ResponseResult delete(int id){
        deployService.delete(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }
}
