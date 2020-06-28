package com.xr.smoke.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class WorkPlan implements Serializable {
    private List<WorkPlan> deptList = new ArrayList<>();
    private Integer id;
    private String title;
    private String content;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss") // 后台传到前台的日期格式转换
    private Date creationTime;
    private String creator;
    private String statuse;
}
