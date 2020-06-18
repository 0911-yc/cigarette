package com.xr.smoke.controller;

import com.xr.smoke.entity.Administrator;
import com.xr.smoke.service.AdminUserService;
import com.xr.smoke.util.ResponseResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
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


}
