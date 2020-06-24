package com.xr.smoke.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class PoliticianTalk implements Serializable {
    private Integer id;
    private String talkName;
    private String talkDempartment;
    private Integer talkPoliticsStatus;
    private String talkDuty;
    private String talkType;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss") // 后台传到前台的日期格式转换
    private Date talkcreationTime;
    private String talkSite;
    private String talkPerson;
    private String talkOutline;
    private String talkContent;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss") // 后台传到前台的日期格式转换
    private Date datacreationTime;
    private String creator;
    private String status;
}
