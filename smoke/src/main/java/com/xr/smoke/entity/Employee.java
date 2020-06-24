package com.xr.smoke.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class Employee implements Serializable {
    private Integer id;

    private String employeeid;

    private String employeename;

    private String employeesex;

    private Integer employeeage;

    private String education;

    private String politicsstatus;

    private String phone;

    private Integer departmentid;

    private String account;

    private String password;

    private Integer postid;

    @JsonFormat(pattern =  "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creationtime;

    private String currentname;

    private String employeestatus;

    private static final long serialVersionUID = 1L;


}