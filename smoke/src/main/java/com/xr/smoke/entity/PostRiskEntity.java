package com.xr.smoke.entity;

import java.sql.Timestamp;
import java.util.Objects;


public class PostRiskEntity {
    private int id;
    private Integer postRiskid;
    private Integer year;
    private Integer departmentId;
    private Integer postId;
    private String project;
    private String describe;
    private String mayOccur;
    private String consequence;
    private String leastValue;
    private Integer grade;
    private String precautionaryMeasurse;
    private Timestamp creationTime;
    private String creator;
    private Integer state;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Integer getPostRiskid() {
        return postRiskid;
    }

    public void setPostRiskid(Integer postRiskid) {
        this.postRiskid = postRiskid;
    }


    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }


    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }


    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }


    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }


    public String getMayOccur() {
        return mayOccur;
    }

    public void setMayOccur(String mayOccur) {
        this.mayOccur = mayOccur;
    }


    public String getConsequence() {
        return consequence;
    }

    public void setConsequence(String consequence) {
        this.consequence = consequence;
    }


    public String getLeastValue() {
        return leastValue;
    }

    public void setLeastValue(String leastValue) {
        this.leastValue = leastValue;
    }


    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }


    public String getPrecautionaryMeasurse() {
        return precautionaryMeasurse;
    }

    public void setPrecautionaryMeasurse(String precautionaryMeasurse) {
        this.precautionaryMeasurse = precautionaryMeasurse;
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
        PostRiskEntity that = (PostRiskEntity) o;
        return id == that.id &&
                Objects.equals(postRiskid, that.postRiskid) &&
                Objects.equals(year, that.year) &&
                Objects.equals(departmentId, that.departmentId) &&
                Objects.equals(postId, that.postId) &&
                Objects.equals(project, that.project) &&
                Objects.equals(describe, that.describe) &&
                Objects.equals(mayOccur, that.mayOccur) &&
                Objects.equals(consequence, that.consequence) &&
                Objects.equals(leastValue, that.leastValue) &&
                Objects.equals(grade, that.grade) &&
                Objects.equals(precautionaryMeasurse, that.precautionaryMeasurse) &&
                Objects.equals(creationTime, that.creationTime) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, postRiskid, year, departmentId, postId, project, describe, mayOccur, consequence, leastValue, grade, precautionaryMeasurse, creationTime, creator, state);
    }
}
