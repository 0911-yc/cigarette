package com.xr.smoke.controller;

import com.xr.smoke.entity.NewsEntity;
import com.xr.smoke.service.EducationService;
import com.xr.smoke.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("new")
@RestController
public class EducationController {
    @Autowired
    EducationService educationService;

    @RequestMapping("newList")
    public ResponseResult newList(NewsEntity newsEntity, Integer page, Integer limit){
        List<NewsEntity> newList=educationService.newList();
        ResponseResult result=new ResponseResult();
        result.getData().put("items",newList);
        result.getData().put("total",newList.size());
        return result;
    }

    @RequestMapping("newDel")
    public ResponseResult newDel(Integer id){
        System.out.println("进来了");
        System.out.println(id+"id");
        educationService.delNewById(id);
        ResponseResult result=new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }

}
