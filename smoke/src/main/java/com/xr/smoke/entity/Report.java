package com.xr.smoke.entity;

import java.io.Serializable;
import java.util.Date;

public class Report implements Serializable {
    private Integer id;

    private Integer visitid;

    private Date creationtime;

    private String visitor;

    private String visitordepartment;

    private String visitpost;

    private String defendant;

    private String defendantdepartment;

    private String defendantpost;

    private String visitcontent;

    private String visitdigest;

    private String departmentopinion;

    private Date signingcreationtime;

    private String groupopinion;

    private Date groupsigningcreationtime;

    private String leaderopinion;

    private Date leadersigningcreationtime;

    private String departmentreult;

    private Date departmentreultcreationtime;

    private String result;

    private Date datecreationtime;

    private Date foundcreationtime;

    private String creator;

    private Integer state;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVisitid() {
        return visitid;
    }

    public void setVisitid(Integer visitid) {
        this.visitid = visitid;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor == null ? null : visitor.trim();
    }

    public String getVisitordepartment() {
        return visitordepartment;
    }

    public void setVisitordepartment(String visitordepartment) {
        this.visitordepartment = visitordepartment == null ? null : visitordepartment.trim();
    }

    public String getVisitpost() {
        return visitpost;
    }

    public void setVisitpost(String visitpost) {
        this.visitpost = visitpost == null ? null : visitpost.trim();
    }

    public String getDefendant() {
        return defendant;
    }

    public void setDefendant(String defendant) {
        this.defendant = defendant == null ? null : defendant.trim();
    }

    public String getDefendantdepartment() {
        return defendantdepartment;
    }

    public void setDefendantdepartment(String defendantdepartment) {
        this.defendantdepartment = defendantdepartment == null ? null : defendantdepartment.trim();
    }

    public String getDefendantpost() {
        return defendantpost;
    }

    public void setDefendantpost(String defendantpost) {
        this.defendantpost = defendantpost == null ? null : defendantpost.trim();
    }

    public String getVisitcontent() {
        return visitcontent;
    }

    public void setVisitcontent(String visitcontent) {
        this.visitcontent = visitcontent == null ? null : visitcontent.trim();
    }

    public String getVisitdigest() {
        return visitdigest;
    }

    public void setVisitdigest(String visitdigest) {
        this.visitdigest = visitdigest == null ? null : visitdigest.trim();
    }

    public String getDepartmentopinion() {
        return departmentopinion;
    }

    public void setDepartmentopinion(String departmentopinion) {
        this.departmentopinion = departmentopinion == null ? null : departmentopinion.trim();
    }

    public Date getSigningcreationtime() {
        return signingcreationtime;
    }

    public void setSigningcreationtime(Date signingcreationtime) {
        this.signingcreationtime = signingcreationtime;
    }

    public String getGroupopinion() {
        return groupopinion;
    }

    public void setGroupopinion(String groupopinion) {
        this.groupopinion = groupopinion == null ? null : groupopinion.trim();
    }

    public Date getGroupsigningcreationtime() {
        return groupsigningcreationtime;
    }

    public void setGroupsigningcreationtime(Date groupsigningcreationtime) {
        this.groupsigningcreationtime = groupsigningcreationtime;
    }

    public String getLeaderopinion() {
        return leaderopinion;
    }

    public void setLeaderopinion(String leaderopinion) {
        this.leaderopinion = leaderopinion == null ? null : leaderopinion.trim();
    }

    public Date getLeadersigningcreationtime() {
        return leadersigningcreationtime;
    }

    public void setLeadersigningcreationtime(Date leadersigningcreationtime) {
        this.leadersigningcreationtime = leadersigningcreationtime;
    }

    public String getDepartmentreult() {
        return departmentreult;
    }

    public void setDepartmentreult(String departmentreult) {
        this.departmentreult = departmentreult == null ? null : departmentreult.trim();
    }

    public Date getDepartmentreultcreationtime() {
        return departmentreultcreationtime;
    }

    public void setDepartmentreultcreationtime(Date departmentreultcreationtime) {
        this.departmentreultcreationtime = departmentreultcreationtime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Date getDatecreationtime() {
        return datecreationtime;
    }

    public void setDatecreationtime(Date datecreationtime) {
        this.datecreationtime = datecreationtime;
    }

    public Date getFoundcreationtime() {
        return foundcreationtime;
    }

    public void setFoundcreationtime(Date foundcreationtime) {
        this.foundcreationtime = foundcreationtime;
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