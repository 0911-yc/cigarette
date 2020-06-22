package com.xr.smoke.controller;

import com.xr.smoke.entity.DatumEntity;
import com.xr.smoke.service.DatumService;
import com.xr.smoke.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dat")
public class DatumController {
    @Autowired
    private DatumService datumService;

    @RequestMapping("datList")
    public ResponseResult datList(){
        List<DatumEntity> datList = datumService.datList();
        ResponseResult result=new ResponseResult();
        result.getData().put("items",datList);
        result.getData().put("total",datList.size());
        return result;
    }

    @RequestMapping("delDat")
    public ResponseResult delDat(Integer id){
        datumService.delListById(id);
        ResponseResult result=new ResponseResult();
        return result;
    }
}
