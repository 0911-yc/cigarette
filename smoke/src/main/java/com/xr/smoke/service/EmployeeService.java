package com.xr.smoke.service;

import com.xr.smoke.entity.Employee;

import java.util.List;

public interface EmployeeService {
    /**
     * 添加用户
     * @param
     */
    public void add(Employee sysUser);

    /**
     * 根据id删除
     * @param
     */
    public void deleteById(int id);

    /**
     * 修改用户
     * @param
     */
    public void update(Employee sysUser);

    /**
     * 根据条件查询用户
     * @param
     * @return
     */
    public List<Employee> list(Employee employee);

    //分页加模糊 查询
    public List<Employee> like(String employeename,Integer page,Integer limit);

}
