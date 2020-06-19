package com.xr.smoke.entity;

import java.io.Serializable;
import java.util.Date;

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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTalkname() {
        return talkname;
    }

    public void setTalkname(String talkname) {
        this.talkname = talkname == null ? null : talkname.trim();
    }

    public String getTalkdempartment() {
        return talkdempartment;
    }

    public void setTalkdempartment(String talkdempartment) {
        this.talkdempartment = talkdempartment == null ? null : talkdempartment.trim();
    }

    public Integer getTalkpoliticsstatus() {
        return talkpoliticsstatus;
    }

    public void setTalkpoliticsstatus(Integer talkpoliticsstatus) {
        this.talkpoliticsstatus = talkpoliticsstatus;
    }

    public String getTalkduty() {
        return talkduty;
    }

    public void setTalkduty(String talkduty) {
        this.talkduty = talkduty == null ? null : talkduty.trim();
    }

    public String getTalktype() {
        return talktype;
    }

    public void setTalktype(String talktype) {
        this.talktype = talktype == null ? null : talktype.trim();
    }

    public Date getTalkcreationtime() {
        return talkcreationtime;
    }

    public void setTalkcreationtime(Date talkcreationtime) {
        this.talkcreationtime = talkcreationtime;
    }

    public String getTalksite() {
        return talksite;
    }

    public void setTalksite(String talksite) {
        this.talksite = talksite == null ? null : talksite.trim();
    }

    public String getTalkperson() {
        return talkperson;
    }

    public void setTalkperson(String talkperson) {
        this.talkperson = talkperson == null ? null : talkperson.trim();
    }

    public String getTalkoutline() {
        return talkoutline;
    }

    public void setTalkoutline(String talkoutline) {
        this.talkoutline = talkoutline == null ? null : talkoutline.trim();
    }

    public String getTalkcontent() {
        return talkcontent;
    }

    public void setTalkcontent(String talkcontent) {
        this.talkcontent = talkcontent == null ? null : talkcontent.trim();
    }

    public Date getDatacreationtime() {
        return datacreationtime;
    }

    public void setDatacreationtime(Date datacreationtime) {
        this.datacreationtime = datacreationtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}