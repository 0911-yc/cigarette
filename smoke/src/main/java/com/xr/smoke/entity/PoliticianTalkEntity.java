package com.xr.smoke.entity;

import java.sql.Timestamp;
import java.util.Objects;


public class PoliticianTalkEntity {
    private int id;
    private String talkName;
    private String talkDempartment;
    private Integer talkPoliticsStatus;
    private String talkDuty;
    private String talkType;
    private Timestamp talkcreationTime;
    private String talkSite;
    private String talkPerson;
    private String talkOutline;
    private String talkContent;
    private Timestamp datacreationTime;
    private String creator;
    private Integer status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTalkName() {
        return talkName;
    }

    public void setTalkName(String talkName) {
        this.talkName = talkName;
    }


    public String getTalkDempartment() {
        return talkDempartment;
    }

    public void setTalkDempartment(String talkDempartment) {
        this.talkDempartment = talkDempartment;
    }


    public Integer getTalkPoliticsStatus() {
        return talkPoliticsStatus;
    }

    public void setTalkPoliticsStatus(Integer talkPoliticsStatus) {
        this.talkPoliticsStatus = talkPoliticsStatus;
    }


    public String getTalkDuty() {
        return talkDuty;
    }

    public void setTalkDuty(String talkDuty) {
        this.talkDuty = talkDuty;
    }


    public String getTalkType() {
        return talkType;
    }

    public void setTalkType(String talkType) {
        this.talkType = talkType;
    }


    public Timestamp getTalkcreationTime() {
        return talkcreationTime;
    }

    public void setTalkcreationTime(Timestamp talkcreationTime) {
        this.talkcreationTime = talkcreationTime;
    }


    public String getTalkSite() {
        return talkSite;
    }

    public void setTalkSite(String talkSite) {
        this.talkSite = talkSite;
    }


    public String getTalkPerson() {
        return talkPerson;
    }

    public void setTalkPerson(String talkPerson) {
        this.talkPerson = talkPerson;
    }


    public String getTalkOutline() {
        return talkOutline;
    }

    public void setTalkOutline(String talkOutline) {
        this.talkOutline = talkOutline;
    }


    public String getTalkContent() {
        return talkContent;
    }

    public void setTalkContent(String talkContent) {
        this.talkContent = talkContent;
    }


    public Timestamp getDatacreationTime() {
        return datacreationTime;
    }

    public void setDatacreationTime(Timestamp datacreationTime) {
        this.datacreationTime = datacreationTime;
    }


    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PoliticianTalkEntity that = (PoliticianTalkEntity) o;
        return id == that.id &&
                Objects.equals(talkName, that.talkName) &&
                Objects.equals(talkDempartment, that.talkDempartment) &&
                Objects.equals(talkPoliticsStatus, that.talkPoliticsStatus) &&
                Objects.equals(talkDuty, that.talkDuty) &&
                Objects.equals(talkType, that.talkType) &&
                Objects.equals(talkcreationTime, that.talkcreationTime) &&
                Objects.equals(talkSite, that.talkSite) &&
                Objects.equals(talkPerson, that.talkPerson) &&
                Objects.equals(talkOutline, that.talkOutline) &&
                Objects.equals(talkContent, that.talkContent) &&
                Objects.equals(datacreationTime, that.datacreationTime) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, talkName, talkDempartment, talkPoliticsStatus, talkDuty, talkType, talkcreationTime, talkSite, talkPerson, talkOutline, talkContent, datacreationTime, creator, status);
    }
}
