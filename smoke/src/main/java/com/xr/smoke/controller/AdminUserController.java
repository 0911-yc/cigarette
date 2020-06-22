package com.xr.smoke.controller;

import com.xr.smoke.entity.Administrator;
import com.xr.smoke.entity.Institution;
import com.xr.smoke.service.AdminUserService;
import com.xr.smoke.service.InstitutionService;
import com.xr.smoke.util.ResponseResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("user")
public class AdminUserController {
    @Autowired
    private AdminUserService adminUserService;

    //部门
    @Autowired
    private InstitutionService institutionService;
    @RequestMapping("info")
    public ResponseResult info(String token){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        ResponseResult result = new ResponseResult();
        if(token.equals(subject.getSession().getId().toString())){
            // 从shiro的session里获得保存的用户信息
            Administrator loginUser = (Administrator) session.getAttribute("USER_SESSION");
            // 获得角色字符串集合
            List<String> roles = (List<String>) session.getAttribute("roles");
            if(loginUser!=null){
                // 根据用户获得角色字符串数组
                roles = adminUserService.findUserRoles(loginUser.getUsername());
                result.getData().put("roles",roles);
//                result.getData().put("introduction",loginUser.getIntroduction());
//                result.getData().put("avatar",loginUser.getAvatar());
                result.getData().put("name",loginUser.getUsername());
                return result;
            }
        }
        return null;
    }

    @RequestMapping("login")
    public ResponseResult login( Administrator administrator){
        System.out.println(administrator.getUsername());
        System.out.println(administrator.getPassword());
        Administrator loginUser = adminUserService.login(administrator);
        ResponseResult result = new ResponseResult();
        UsernamePasswordToken token = new UsernamePasswordToken(administrator.getUsername(), administrator.getPassword());
        // 获得登录的主题
        Subject subject = SecurityUtils.getSubject();
        System.out.println(token+"token"+administrator.getPassword()+"mm");
        // 调用登录方法
        subject.login(token);
        // 返回给前台的toke，唯一标识用户
        result.getData().put("token",subject.getSession().getId());
        result.getData().put("message","登陆成功");
//        if(loginUser!=null){
//            // 登录成功，返回前端的消息
//            result.getData().put("message","登录成功");
//        }else{
//            result.setCode(20200);
//            //登录失败，返回前端的消息
//            result.getData().put("message","登录失败，用户名或密码错误");
//        }
        return result;
    }

    @RequestMapping("logout")
    public ResponseResult logout(){
        ResponseResult result = new ResponseResult();
        Subject subject = SecurityUtils.getSubject();
        // 只需调用shiro的logout方法就可以了
        subject.logout();
        return result;
    }


    //部门
    @RequestMapping("list")
    @RequiresPermissions("user:list")
    public ResponseResult list(Integer page,Integer limit){
        List<Institution> list = institutionService.list();
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",list.size());
        System.out.println(list.size());
        return result;
    }

    @RequestMapping("add")
    @RequiresPermissions("user:add")
    public ResponseResult add(Institution institution){
        institutionService.add(institution);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("user:update")
    public ResponseResult update(Institution institution){
        institutionService.update(institution);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    @RequiresPermissions("user:delete")
    public ResponseResult add(Integer id){
        institutionService.deleteById(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }

}
