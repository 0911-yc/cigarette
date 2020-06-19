package com.xr.smoke.entity;

import java.io.Serializable;
import java.util.Date;

public class FlowRisk implements Serializable {
    private Integer id;

    private Integer flowriskid;

    private String flowriskname;

    private String flowriskyear;

    private String flowriskinformation;

    private String accessory;

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

    public Integer getFlowriskid() {
        return flowriskid;
    }

    public void setFlowriskid(Integer flowriskid) {
        this.flowriskid = flowriskid;
    }

    public String getFlowriskname() {
        return flowriskname;
    }

    public void setFlowriskname(String flowriskname) {
        this.flowriskname = flowriskname == null ? null : flowriskname.trim();
    }

    public String getFlowriskyear() {
        return flowriskyear;
    }

    public void setFlowriskyear(String flowriskyear) {
        this.flowriskyear = flowriskyear == null ? null : flowriskyear.trim();
    }

    public String getFlowriskinformation() {
        return flowriskinformation;
    }

    public void setFlowriskinformation(String flowriskinformation) {
        this.flowriskinformation = flowriskinformation == null ? null : flowriskinformation.trim();
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory == null ? null : accessory.trim();
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