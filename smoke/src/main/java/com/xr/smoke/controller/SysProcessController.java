package com.xr.smoke.controller;

import com.sun.javafx.binding.StringFormatter;
import com.xr.smoke.entity.RiskPointwarning;
import com.xr.smoke.entity.SysProcess;
import com.xr.smoke.service.SysProcessService;
import com.xr.smoke.util.ResponseResult;
import com.xr.smoke.util.StringSubstring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("sysProcess")
public class SysProcessController {

    @Autowired
    private SysProcessService sysProcessService;

    @RequestMapping("list")
    public ResponseResult list(SysProcess sysProcess, Integer page, Integer limit){
        List<SysProcess> list = sysProcessService.list(sysProcess);
        List<SysProcess> list1 = sysProcessService.list1(sysProcess.getTitle(),sysProcess.getContent(), (page - 1) * limit, limit);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list1);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(SysProcess sysProcess){
        StringSubstring stringSubstring = new StringSubstring();
        sysProcess.setContent(stringSubstring.substring(sysProcess.getContent()));
        //获取系统当前时间
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=null;
        try {
            time=sdf.parse(sdf.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        sysProcess.setCreatetime(time);
        sysProcessService.add(sysProcess);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    public ResponseResult update(SysProcess sysProcess){
        //截取富文本框中自动添加的<p>标签
        StringSubstring stringSubstring = new StringSubstring();
        sysProcess.setContent(stringSubstring.substring(sysProcess.getContent()));
        sysProcessService.update(sysProcess);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    public ResponseResult delete(Integer id){
        sysProcessService.delete(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }

}
