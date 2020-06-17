package com.xr.smoke.entity;

import java.sql.Timestamp;
import java.util.Objects;


public class EmployeeEntity {
    private int id;
    private int employeeId;
    private String employeeName;
    private String employeeSex;
    private int employeeAge;
    private int education;
    private Integer politicsStatus;
    private String phone;
    private Integer departmentId;
    private String account;
    private String password;
    private Integer postId;
    private Timestamp time;
    private String currentName;
    private Integer employeeStatus;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }


    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }


    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }


    public Integer getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(Integer politicsStatus) {
        this.politicsStatus = politicsStatus;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }


    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }


    public String getCurrentName() {
        return currentName;
    }

    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }


    public Integer getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(Integer employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return id == that.id &&
                employeeId == that.employeeId &&
                employeeAge == that.employeeAge &&
                education == that.education &&
                Objects.equals(employeeName, that.employeeName) &&
                Objects.equals(employeeSex, that.employeeSex) &&
                Objects.equals(politicsStatus, that.politicsStatus) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(departmentId, that.departmentId) &&
                Objects.equals(account, that.account) &&
                Objects.equals(password, that.password) &&
                Objects.equals(postId, that.postId) &&
                Objects.equals(time, that.time) &&
                Objects.equals(currentName, that.currentName) &&
                Objects.equals(employeeStatus, that.employeeStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeId, employeeName, employeeSex, employeeAge, education, politicsStatus, phone, departmentId, account, password, postId, time, currentName, employeeStatus);
    }
}
