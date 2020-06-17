package com.xr.smoke.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class AdministratorEntity {
    private int id;
    private String departmentId;
    private String departmentName;
    private String departmentHead;
    private String divisionalManagement;
    private String leader;
    private Timestamp creationTime;
    private Integer currentId;
    private String currentName;
    private Integer departmentState;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    public String getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }


    public String getDivisionalManagement() {
        return divisionalManagement;
    }

    public void setDivisionalManagement(String divisionalManagement) {
        this.divisionalManagement = divisionalManagement;
    }


    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }


    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }


    public Integer getCurrentId() {
        return currentId;
    }

    public void setCurrentId(Integer currentId) {
        this.currentId = currentId;
    }


    public String getCurrentName() {
        return currentName;
    }

    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }


    public Integer getDepartmentState() {
        return departmentState;
    }

    public void setDepartmentState(Integer departmentState) {
        this.departmentState = departmentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdministratorEntity that = (AdministratorEntity) o;
        return id == that.id &&
                Objects.equals(departmentId, that.departmentId) &&
                Objects.equals(departmentName, that.departmentName) &&
                Objects.equals(departmentHead, that.departmentHead) &&
                Objects.equals(divisionalManagement, that.divisionalManagement) &&
                Objects.equals(leader, that.leader) &&
                Objects.equals(creationTime, that.creationTime) &&
                Objects.equals(currentId, that.currentId) &&
                Objects.equals(currentName, that.currentName) &&
                Objects.equals(departmentState, that.departmentState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departmentId, departmentName, departmentHead, divisionalManagement, leader, creationTime, currentId, currentName, departmentState);
    }
}
