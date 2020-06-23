package com.xr.smoke.mapper;

import com.xr.smoke.entity.Employee;
import com.xr.smoke.entity.EmployeeExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    //查询全部
    @Select("select id,employeeId,employeeName,employeeSex,employeeAge,education,politicsStatus,phone,departmentID,Account,password,postId,creationTime,currentName,employeeStatus from employee")
    List<Employee> list(Employee employee);

    //添加
    @Insert("insert into employee(id,employeeId,employeeName,employeeSex,employeeAge,education,politicsStatus,phone,Account,password,creationTime) values(NULL,#{employeeid},#{employeename},#{employeesex},#{employeeage},#{education},#{politicsstatus},#{phone},#{account},#{password},NOW())")
    void add(Employee employee);

    //修改
    @Update("update employee set employeeId=#{employeeid},employeeName=#{employeename},employeeSex=#{employeesex},employeeAge=#{employeeage},education=#{education},politicsStatus=#{politicsstatus},phone=#{phone},Account=#{account},password=#{password}")
    void update(Employee employee);

    //模糊查询加分页
    @Select({"<script>SELECT id,employeeId,employeeName,employeeSex,employeeAge,education,politicsStatus,phone,departmentID,Account,password,postId,creationTime,currentName,employeeStatus from employee where 1=1" ,
            "<when test='employeename!=null'>",
            " and employeeName like '%${employeename}%'",
            "</when>",
            "ORDER BY id desc",
            "limit #{page},#{limit}",
            "</script>"})
    List<Employee> like(@Param("employeename") String title, @Param("page") Integer page, @Param("limit") Integer limit);

}