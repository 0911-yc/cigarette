package com.xr.smoke.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PoliticianTalk implements Serializable {
    private Integer id;

    private String talkname;

    private String talkdempartment;

    private Integer talkpoliticsstatus;

    private String talkduty;

    private String talktype;

    private Date talkcreationtime;

    private String talksite;

    private String talkperson;

    private String talkoutline;

    private String talkcontent;

    private Date datacreationtime;

    private String creator;

    private Integer status;

}
