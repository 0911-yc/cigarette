package com.xr.smoke.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Responsibility {
    private Integer id;
    private String supervisionid;
    private String supervisiontype;
    private String supervisiontitle;
    private String supervisioncontent;
    private Integer departmentid;
    private String accessories;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss") // 后台传到前台的日期格式转换
    private Date creationTime;
    private String creator;
    private String status;
}
