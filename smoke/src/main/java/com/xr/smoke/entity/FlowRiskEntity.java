package com.xr.smoke.entity;

import java.sql.Timestamp;
import java.util.Objects;


public class FlowRiskEntity {
    private int id;
    private Integer flowRiskId;
    private String flowRiskName;
    private String flowRiskYear;
    private String flowRiskInformation;
    private String accessory;
    private Timestamp creationTime;
    private String creator;
    private Integer state;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Integer getFlowRiskId() {
        return flowRiskId;
    }

    public void setFlowRiskId(Integer flowRiskId) {
        this.flowRiskId = flowRiskId;
    }


    public String getFlowRiskName() {
        return flowRiskName;
    }

    public void setFlowRiskName(String flowRiskName) {
        this.flowRiskName = flowRiskName;
    }


    public String getFlowRiskYear() {
        return flowRiskYear;
    }

    public void setFlowRiskYear(String flowRiskYear) {
        this.flowRiskYear = flowRiskYear;
    }


    public String getFlowRiskInformation() {
        return flowRiskInformation;
    }

    public void setFlowRiskInformation(String flowRiskInformation) {
        this.flowRiskInformation = flowRiskInformation;
    }


    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }


    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }


    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowRiskEntity that = (FlowRiskEntity) o;
        return id == that.id &&
                Objects.equals(flowRiskId, that.flowRiskId) &&
                Objects.equals(flowRiskName, that.flowRiskName) &&
                Objects.equals(flowRiskYear, that.flowRiskYear) &&
                Objects.equals(flowRiskInformation, that.flowRiskInformation) &&
                Objects.equals(accessory, that.accessory) &&
                Objects.equals(creationTime, that.creationTime) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flowRiskId, flowRiskName, flowRiskYear, flowRiskInformation, accessory, creationTime, creator, state);
    }
}
