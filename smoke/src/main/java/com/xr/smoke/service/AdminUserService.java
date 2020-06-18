package com.xr.smoke.service;

import com.xr.smoke.entity.Administrator;

import java.util.List;

public interface AdminUserService {
    //登录
    public Administrator login(Administrator administrator);


    /**
     * 根据用户名查询用户信息
     * @return
     */
    public Administrator findUserByUserName(String username);

    /**
     * 根据用户名获得角色的集合
     * @param account
     * @return
     */
    public List<String> findUserRoles(String account);
}
