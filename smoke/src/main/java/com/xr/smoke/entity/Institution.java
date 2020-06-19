package com.xr.smoke.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Institution implements Serializable {
    private Integer id;

    private String departmentid;

    private String departmentname;

    private String departmenthead;

    private String divisionalmanagement;

    private String leader;

    private Date creationtime;

    private Integer currentid;

    private String currentname;

    private Integer departmentstate;

    private static final long serialVersionUID = 1L;

    private State state;
}