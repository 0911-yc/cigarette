package com.xr.smoke.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

@Data
public class Institution implements Serializable {
    private Integer id;

    private String departmentid;

    private String departmentname;

    private String departmenthead;

    private String divisionalmanagement;

    private String leader;

    @JsonFormat(pattern =  "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creationtime;

    private Integer currentid;

    private String currentname;

    private Integer departmentstate;

    private static final long serialVersionUID = 1L;


    //private List<State> statelist=new ArrayList<>();
}