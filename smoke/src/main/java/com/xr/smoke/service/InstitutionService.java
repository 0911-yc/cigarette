package com.xr.smoke.service;

import com.xr.smoke.entity.Administrator;
import com.xr.smoke.entity.Institution;

import java.util.List;

public interface InstitutionService {
    /**
     * 添加用户
     * @param
     */
    public void add(Institution institution);

    /**
     * 根据id删除
     * @param id
     */
    public void deleteById(Integer id);

    /**
     * 修改
     * @param
     */
    public void update(Institution institution);

    /**
     * 查询用户
     * @param
     * @return
     */
    public List<Institution> list(Institution institution);

    //模糊查询
    public List<Institution> list1(String departmenthead,Integer page,Integer limit);
}
