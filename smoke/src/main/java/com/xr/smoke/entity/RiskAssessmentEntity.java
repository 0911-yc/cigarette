package com.xr.smoke.entity;

import java.sql.Timestamp;
import java.util.Objects;


public class RiskAssessmentEntity {
    private int id;
    private String department;
    private String primaryRisk;
    private String secondLevel;
    private String threeLevel;
    private Timestamp creationTime;
    private String creator;
    private Integer state;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getPrimaryRisk() {
        return primaryRisk;
    }

    public void setPrimaryRisk(String primaryRisk) {
        this.primaryRisk = primaryRisk;
    }


    public String getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(String secondLevel) {
        this.secondLevel = secondLevel;
    }


    public String getThreeLevel() {
        return threeLevel;
    }

    public void setThreeLevel(String threeLevel) {
        this.threeLevel = threeLevel;
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
        RiskAssessmentEntity that = (RiskAssessmentEntity) o;
        return id == that.id &&
                Objects.equals(department, that.department) &&
                Objects.equals(primaryRisk, that.primaryRisk) &&
                Objects.equals(secondLevel, that.secondLevel) &&
                Objects.equals(threeLevel, that.threeLevel) &&
                Objects.equals(creationTime, that.creationTime) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, department, primaryRisk, secondLevel, threeLevel, creationTime, creator, state);
    }
}
