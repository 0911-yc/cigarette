package com.xr.smoke.service.impl;

import com.xr.smoke.entity.Employee;
import com.xr.smoke.entity.EmployeeExample;
import com.xr.smoke.mapper.EmployeeMapper;
import com.xr.smoke.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public void add(Employee employee) {
        employeeMapper.add(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Employee employee) {
        employeeMapper.update(employee);
    }

    @Override
    public List<Employee> list(Employee employee) {
        return  employeeMapper.list(employee);
    }

    @Override
    public List<Employee> like(String employeename, Integer page, Integer limit) {
       return employeeMapper.like(employeename,page,limit);
    }


}
