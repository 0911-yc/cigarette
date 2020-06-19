package com.xr.smoke.entity;

import java.io.Serializable;
import java.util.Date;

public class RiskAssessment implements Serializable {
    private Integer id;

    private String department;

    private String primaryrisk;

    private String secondlevel;

    private String threelevel;

    private Date creationtime;

    private String creator;

    private Integer state;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPrimaryrisk() {
        return primaryrisk;
    }

    public void setPrimaryrisk(String primaryrisk) {
        this.primaryrisk = primaryrisk == null ? null : primaryrisk.trim();
    }

    public String getSecondlevel() {
        return secondlevel;
    }

    public void setSecondlevel(String secondlevel) {
        this.secondlevel = secondlevel == null ? null : secondlevel.trim();
    }

    public String getThreelevel() {
        return threelevel;
    }

    public void setThreelevel(String threelevel) {
        this.threelevel = threelevel == null ? null : threelevel.trim();
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}