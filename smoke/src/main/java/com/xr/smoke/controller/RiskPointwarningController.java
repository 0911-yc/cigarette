package com.xr.smoke.controller;

import com.xr.smoke.entity.RiskPointwarning;
import com.xr.smoke.service.RiskPointwarningService;
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
@RequestMapping("riskPointwarning")
public class RiskPointwarningController {
    @Autowired
    private RiskPointwarningService riskPointwarningService;

    @RequestMapping("list")
    public ResponseResult list(RiskPointwarning riskPointwarning, Integer page, Integer limit){
        List<RiskPointwarning> list = riskPointwarningService.list(riskPointwarning);
        List<RiskPointwarning> list1 = riskPointwarningService.list1(riskPointwarning.getTitle(),riskPointwarning.getContent(), (page - 1) * limit, limit);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list1);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(RiskPointwarning riskPointwarning){
        StringSubstring stringSubstring = new StringSubstring();
        riskPointwarning.setContent(stringSubstring.substring(riskPointwarning.getContent()));
        //获取系统当前时间
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = new String(String.valueOf(System.currentTimeMillis()));
        Date time=null;
        try {
            time=sdf.parse(sdf.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        riskPointwarning.setNumber(timestamp);
        riskPointwarning.setCreatetime(time);
        riskPointwarningService.add(riskPointwarning);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    public ResponseResult update(RiskPointwarning riskPointwarning){
        //截取富文本框中自动添加的<p>标签
        StringSubstring stringSubstring = new StringSubstring();
        riskPointwarning.setContent(stringSubstring.substring(riskPointwarning.getContent()));
        riskPointwarningService.update(riskPointwarning);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    public ResponseResult delete(Integer id){
        riskPointwarningService.delete(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }
}
