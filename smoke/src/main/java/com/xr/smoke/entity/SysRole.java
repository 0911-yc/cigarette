package com.xr.smoke.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class SysRole implements Serializable {
    private Integer id;

    private String name;

    // 权限集合
    private List<SysMenu> menus = new ArrayList<>();

    private static final long serialVersionUID = 1L;



}