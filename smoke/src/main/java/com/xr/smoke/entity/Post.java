package com.xr.smoke.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class Post implements Serializable {
    private Integer id;

    private String postid;

    private String postname;

    private Date time;

    private String creator;

    private String poststatus;

    private static final long serialVersionUID = 1L;

}