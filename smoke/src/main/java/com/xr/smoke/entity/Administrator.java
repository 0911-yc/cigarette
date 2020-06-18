package com.xr.smoke.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Administrator {
    private int id;
    private String username;
    private String password;
    private String salt;

    //角色集合
    private List<SysRole> roles=new ArrayList<>();
}
