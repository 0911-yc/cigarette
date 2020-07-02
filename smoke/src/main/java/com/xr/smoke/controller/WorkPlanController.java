package com.xr.smoke.controller;

import com.xr.smoke.entity.StatusEntity;
import com.xr.smoke.entity.WorkPlan;
import com.xr.smoke.service.WorkPlanService;
import com.xr.smoke.util.ResponseResult;
import com.xr.smoke.util.StringSubstring;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("workplan")
public class WorkPlanController {
    @Autowired
    private WorkPlanService workPlanService;

    @RequestMapping("list")
    // @RequiresPermissions("workplan:list")
    public ResponseResult list(WorkPlan workPlan,Integer page,Integer limit){
        List<WorkPlan> list = workPlanService.list(workPlan);
        List<WorkPlan> list1 = workPlanService.list1(workPlan.getTitle(),(page-1)*limit,limit);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list1);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("add")
    // @RequiresPermissions("workplan:add")
    public ResponseResult add(WorkPlan workPlan){
        StringSubstring stringSubstring = new StringSubstring();
        workPlan.setContent(stringSubstring.substring(workPlan.getContent()));
        //获取系统当前时间
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=null;
        try {
            time=sdf.parse(sdf.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        workPlan.setCreationTime(time);
        workPlanService.add(workPlan);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    // @RequiresPermissions("workplan:update")
    public ResponseResult update(WorkPlan workPlan){
        StringSubstring stringSubstring = new StringSubstring();
        workPlan.setContent(stringSubstring.substring(workPlan.getContent()));
        workPlanService.update(workPlan);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    // @RequiresPermissions("workplan:delete")
    public ResponseResult delete(int id){
        workPlanService.delete(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }

    @RequestMapping("groupDept")
    // @RequiresPermissions("workplan:groupDept")
    public ResponseResult groupDept(StatusEntity statusEntity){
        List<StatusEntity> groupDept = workPlanService.groupDept(statusEntity);
        System.out.println(groupDept);
        ResponseResult result = new ResponseResult();
        result.getData().put("deptList",groupDept);
        return result;
    }
}
