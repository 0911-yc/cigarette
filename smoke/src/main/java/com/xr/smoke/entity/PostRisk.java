package com.xr.smoke.entity;

import java.io.Serializable;
import java.util.Date;

public class PostRisk implements Serializable {
    private Integer id;

    private Integer postriskid;

    private Integer year;

    private Integer departmentid;

    private Integer postid;

    private String project;

    private String describe;

    private String mayoccur;

    private String consequence;

    private String leastvalue;

    private Integer grade;

    private String precautionarymeasurse;

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

    public Integer getPostriskid() {
        return postriskid;
    }

    public void setPostriskid(Integer postriskid) {
        this.postriskid = postriskid;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getMayoccur() {
        return mayoccur;
    }

    public void setMayoccur(String mayoccur) {
        this.mayoccur = mayoccur == null ? null : mayoccur.trim();
    }

    public String getConsequence() {
        return consequence;
    }

    public void setConsequence(String consequence) {
        this.consequence = consequence == null ? null : consequence.trim();
    }

    public String getLeastvalue() {
        return leastvalue;
    }

    public void setLeastvalue(String leastvalue) {
        this.leastvalue = leastvalue == null ? null : leastvalue.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getPrecautionarymeasurse() {
        return precautionarymeasurse;
    }

    public void setPrecautionarymeasurse(String precautionarymeasurse) {
        this.precautionarymeasurse = precautionarymeasurse == null ? null : precautionarymeasurse.trim();
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