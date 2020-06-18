package com.xr.smoke.service.impl;

import com.xr.smoke.entity.AdministratorExample;
import com.xr.smoke.entity.Administrator;
import com.xr.smoke.mapper.AdminUserMapper;
import com.xr.smoke.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserSericeImpl implements AdminUserService {

    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public Administrator login(Administrator administrator) {
        // 构建自定义查询条件
       AdministratorExample example = new AdministratorExample();
        AdministratorExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(administrator.getUsername());
        criteria.andPasswordEqualTo(administrator.getPassword());
        List<Administrator> list =  adminUserMapper.selectByExample(example);
        System.out.println(list.size());
        if(list!=null && list.size()==1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public Administrator findUserByUserName(String username) {
        AdministratorExample example = new AdministratorExample();
        AdministratorExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Administrator> list =  adminUserMapper.findUserByUserName(username);
        if(list!=null && list.size()==1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<String> findUserRoles(String username) {
        List<String> roles = adminUserMapper.findUserRoles(username);
        return roles;
    }
}
