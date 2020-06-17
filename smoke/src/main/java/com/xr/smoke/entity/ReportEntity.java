package com.xr.smoke.entity;

import java.sql.Timestamp;
import java.util.Objects;


public class ReportEntity {
    private int id;
    private Integer visitId;
    private Timestamp creationTime;
    private String visitor;
    private String visitorDepartment;
    private String visitPost;
    private String defendant;
    private String defendantDepartment;
    private String defendantPost;
    private String visitContent;
    private String visitDigest;
    private String departmentOpinion;
    private Timestamp signingcreationTime;
    private String groupOpinion;
    private Timestamp groupSigningcreationTime;
    private String leaderOpinion;
    private Timestamp leaderSigningcreationTime;
    private String departmentReult;
    private Timestamp departmentReultcreationTime;
    private String result;
    private Timestamp datecreationTime;
    private Timestamp foundcreationTime;
    private String creator;
    private Integer state;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }


    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }


    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }


    public String getVisitorDepartment() {
        return visitorDepartment;
    }

    public void setVisitorDepartment(String visitorDepartment) {
        this.visitorDepartment = visitorDepartment;
    }


    public String getVisitPost() {
        return visitPost;
    }

    public void setVisitPost(String visitPost) {
        this.visitPost = visitPost;
    }


    public String getDefendant() {
        return defendant;
    }

    public void setDefendant(String defendant) {
        this.defendant = defendant;
    }


    public String getDefendantDepartment() {
        return defendantDepartment;
    }

    public void setDefendantDepartment(String defendantDepartment) {
        this.defendantDepartment = defendantDepartment;
    }


    public String getDefendantPost() {
        return defendantPost;
    }

    public void setDefendantPost(String defendantPost) {
        this.defendantPost = defendantPost;
    }


    public String getVisitContent() {
        return visitContent;
    }

    public void setVisitContent(String visitContent) {
        this.visitContent = visitContent;
    }


    public String getVisitDigest() {
        return visitDigest;
    }

    public void setVisitDigest(String visitDigest) {
        this.visitDigest = visitDigest;
    }


    public String getDepartmentOpinion() {
        return departmentOpinion;
    }

    public void setDepartmentOpinion(String departmentOpinion) {
        this.departmentOpinion = departmentOpinion;
    }


    public Timestamp getSigningcreationTime() {
        return signingcreationTime;
    }

    public void setSigningcreationTime(Timestamp signingcreationTime) {
        this.signingcreationTime = signingcreationTime;
    }


    public String getGroupOpinion() {
        return groupOpinion;
    }

    public void setGroupOpinion(String groupOpinion) {
        this.groupOpinion = groupOpinion;
    }


    public Timestamp getGroupSigningcreationTime() {
        return groupSigningcreationTime;
    }

    public void setGroupSigningcreationTime(Timestamp groupSigningcreationTime) {
        this.groupSigningcreationTime = groupSigningcreationTime;
    }


    public String getLeaderOpinion() {
        return leaderOpinion;
    }

    public void setLeaderOpinion(String leaderOpinion) {
        this.leaderOpinion = leaderOpinion;
    }


    public Timestamp getLeaderSigningcreationTime() {
        return leaderSigningcreationTime;
    }

    public void setLeaderSigningcreationTime(Timestamp leaderSigningcreationTime) {
        this.leaderSigningcreationTime = leaderSigningcreationTime;
    }


    public String getDepartmentReult() {
        return departmentReult;
    }

    public void setDepartmentReult(String departmentReult) {
        this.departmentReult = departmentReult;
    }


    public Timestamp getDepartmentReultcreationTime() {
        return departmentReultcreationTime;
    }

    public void setDepartmentReultcreationTime(Timestamp departmentReultcreationTime) {
        this.departmentReultcreationTime = departmentReultcreationTime;
    }


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public Timestamp getDatecreationTime() {
        return datecreationTime;
    }

    public void setDatecreationTime(Timestamp datecreationTime) {
        this.datecreationTime = datecreationTime;
    }


    public Timestamp getFoundcreationTime() {
        return foundcreationTime;
    }

    public void setFoundcreationTime(Timestamp foundcreationTime) {
        this.foundcreationTime = foundcreationTime;
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
        ReportEntity that = (ReportEntity) o;
        return id == that.id &&
                Objects.equals(visitId, that.visitId) &&
                Objects.equals(creationTime, that.creationTime) &&
                Objects.equals(visitor, that.visitor) &&
                Objects.equals(visitorDepartment, that.visitorDepartment) &&
                Objects.equals(visitPost, that.visitPost) &&
                Objects.equals(defendant, that.defendant) &&
                Objects.equals(defendantDepartment, that.defendantDepartment) &&
                Objects.equals(defendantPost, that.defendantPost) &&
                Objects.equals(visitContent, that.visitContent) &&
                Objects.equals(visitDigest, that.visitDigest) &&
                Objects.equals(departmentOpinion, that.departmentOpinion) &&
                Objects.equals(signingcreationTime, that.signingcreationTime) &&
                Objects.equals(groupOpinion, that.groupOpinion) &&
                Objects.equals(groupSigningcreationTime, that.groupSigningcreationTime) &&
                Objects.equals(leaderOpinion, that.leaderOpinion) &&
                Objects.equals(leaderSigningcreationTime, that.leaderSigningcreationTime) &&
                Objects.equals(departmentReult, that.departmentReult) &&
                Objects.equals(departmentReultcreationTime, that.departmentReultcreationTime) &&
                Objects.equals(result, that.result) &&
                Objects.equals(datecreationTime, that.datecreationTime) &&
                Objects.equals(foundcreationTime, that.foundcreationTime) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, visitId, creationTime, visitor, visitorDepartment, visitPost, defendant, defendantDepartment, defendantPost, visitContent, visitDigest, departmentOpinion, signingcreationTime, groupOpinion, groupSigningcreationTime, leaderOpinion, leaderSigningcreationTime, departmentReult, departmentReultcreationTime, result, datecreationTime, foundcreationTime, creator, state);
    }
}
