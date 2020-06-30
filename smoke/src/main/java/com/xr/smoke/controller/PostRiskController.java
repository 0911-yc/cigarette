package com.xr.smoke.controller;

import com.xr.smoke.entity.Institution;
import com.xr.smoke.entity.Post;
import com.xr.smoke.entity.PostRisk;
import com.xr.smoke.service.PostRiskService;
import com.xr.smoke.util.ResponseResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/risk")
public class PostRiskController {

    @Autowired
    private PostRiskService postRiskService;

    /**
     * 获取部门
     * @return
     */
    @RequestMapping("/dept")
    public ResponseResult dept(){
        List<Institution> deptsel = postRiskService.deptsel();
        ResponseResult result = new ResponseResult();
        result.getData().put("items",deptsel);
        return result;
    }

    /**
     * 获取岗位
     * @param id
     * @return
     */
    @RequestMapping("/post")
    public ResponseResult post(@Param("id") Integer id){
        List<Post> postdid = postRiskService.postdid(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",postdid);
        return result;
    }

    /**
     * 获取查询所有的条件数据
     */
    @RequestMapping("/getselCondition")
    public ResponseResult getDate(@Param("did") Integer did,@Param("pid") Integer pid){
        List<Map<String, Object>> date = postRiskService.getselCondition(did,pid);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",date);
        return result;
    }

    /**
     * 获取查询所有的数据
     */
    @RequestMapping("/getsel")
    public ResponseResult getsel(){
        List<Map<String, Object>> getsel = postRiskService.getsel();
        ResponseResult result = new ResponseResult();
        result.getData().put("items",getsel);
        return result;
    }

    //查询风险占比分析的数据
    @RequestMapping("listPostRisk")
    //@Log(detail = "查询风险占比信息",level = 3,operationUnit = OperationUnit.USER,operationType = OperationType.SELECT)
    public ResponseResult listPostRisk(PostRisk postRisk) {

        /*if(postRisk.getYear()==""){
            postRisk.setYear(null);
        }*/
    /*    if(postRisk.getYear()!=null){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");//格式化规则
        Date date = postRisk.getYear();//获得要处理的时间 Date型
        String strDate = sdf.format(date); //格式化成yyyy-MM-dd格式的时间字符串
        Date newDate1 = sdf.parse(strDate);//将字符串转换为时间格式
        java.sql.Date resultDate1 = new java.sql.Date(newDate1.getTime());
        postRisk.setYear(resultDate1);
        }*/
        List<PostRisk> listquery=postRiskService.Postselect(postRisk);


        ResponseResult result = new ResponseResult();
        result.getData().put("items",listquery);
        return result;
    }
}
