package com.xr.smoke.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Deploy implements Serializable {
    private Integer id;

    private String title;

    private String content;

    private Date creationtime;

    private String creator;

    private Integer status;
}
