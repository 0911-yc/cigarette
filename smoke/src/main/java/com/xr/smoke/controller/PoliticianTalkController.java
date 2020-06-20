package com.xr.smoke.controller;

import com.xr.smoke.entity.PoliticianTalk;
import com.xr.smoke.entity.WorkPlan;
import com.xr.smoke.service.PoliticianTalkService;
import com.xr.smoke.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("talk")
public class PoliticianTalkController {

    @Autowired
    private PoliticianTalkService politicianTalkService;

    @RequestMapping("list")
    public ResponseResult list(PoliticianTalk politicianTalk, Integer page, Integer limit){
        List<PoliticianTalk> list = politicianTalkService.list(politicianTalk);
        List<PoliticianTalk> list1 = politicianTalkService.list1(politicianTalk.getTalkType(),(page-1)*limit,limit);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list1);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(PoliticianTalk politicianTalk){
        //获取系统当前时间
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=null;
        try {
            time=sdf.parse(sdf.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        politicianTalk.setTalkcreationTime(time);
        politicianTalkService.add(politicianTalk);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    public ResponseResult update(PoliticianTalk politicianTalk){
        politicianTalkService.update(politicianTalk);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    public ResponseResult delete(int id){
        politicianTalkService.delete(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }
}
