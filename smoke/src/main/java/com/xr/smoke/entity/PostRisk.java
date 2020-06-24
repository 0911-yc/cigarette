package com.xr.smoke.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PostRisk implements Serializable {
    private Integer id;

    private Date year;

    private Integer did;

    private Integer pid;

    private String project;

    private String descrption;

    private Integer probability;

    private Integer ponderance;

    private Integer riskValue;

    private Integer grade;

    private String precautionarymeasurse;

    private Date creationtime;

    private Integer creator;

    private String cname;
    private Integer state;

    private static final long serialVersionUID = 1L;

}