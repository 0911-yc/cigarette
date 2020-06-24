package com.xr.smoke.controller;

import com.xr.smoke.entity.Contribute;
import com.xr.smoke.entity.ContributeExample;
import com.xr.smoke.service.ContributeService;
import com.xr.smoke.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("con")
public class ContributeController {
    @Autowired
    private ContributeService contributeService;

    @RequestMapping("conList")
    public ResponseResult conList(ContributeExample example){
        List<Contribute> conList =contributeService.selectAll();
        ResponseResult result=new ResponseResult();
        result.getData().put("items",conList);
        result.getData().put("total",conList.size());
        return result;
    }

    @RequestMapping("delCon")
    public ResponseResult delCon(Integer id){
        contributeService.delCon(id);
        ResponseResult result=new ResponseResult();
        return result;
    }
}
