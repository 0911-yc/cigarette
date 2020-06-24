package com.xr.smoke.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class StatusEntity {
    private List<StatusEntity> deptList = new ArrayList<>();
    private int id;
    private String status;
}
