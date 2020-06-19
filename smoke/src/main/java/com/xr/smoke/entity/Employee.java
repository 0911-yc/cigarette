package com.xr.smoke.entity;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private Integer id;

    private Integer employeeid;

    private String employeename;

    private String employeesex;

    private Integer employeeage;

    private Integer education;

    private Integer politicsstatus;

    private String phone;

    private Integer departmentid;

    private String account;

    private String password;

    private Integer postid;

    private Date time;

    private String currentname;

    private Integer employeestatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename == null ? null : employeename.trim();
    }

    public String getEmployeesex() {
        return employeesex;
    }

    public void setEmployeesex(String employeesex) {
        this.employeesex = employeesex == null ? null : employeesex.trim();
    }

    public Integer getEmployeeage() {
        return employeeage;
    }

    public void setEmployeeage(Integer employeeage) {
        this.employeeage = employeeage;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getPoliticsstatus() {
        return politicsstatus;
    }

    public void setPoliticsstatus(Integer politicsstatus) {
        this.politicsstatus = politicsstatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCurrentname() {
        return currentname;
    }

    public void setCurrentname(String currentname) {
        this.currentname = currentname == null ? null : currentname.trim();
    }

    public Integer getEmployeestatus() {
        return employeestatus;
    }

    public void setEmployeestatus(Integer employeestatus) {
        this.employeestatus = employeestatus;
    }
}