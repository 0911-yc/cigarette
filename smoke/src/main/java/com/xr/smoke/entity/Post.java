package com.xr.smoke.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Post implements Serializable {
    private Integer id;

    private String postid;

    private String postname;

    private Integer did;

    private Date time;

    private String creator;

    private Integer poststatus;

}
