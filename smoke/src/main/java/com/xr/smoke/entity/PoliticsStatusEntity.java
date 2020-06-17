package com.xr.smoke.entity;

import java.util.Objects;


public class PoliticsStatusEntity {
    private int id;
    private String chinaMenber;
    private String probationary;
    private String league;
    private String patriots;
    private String massess;
    private String party;
    private String alliance;
    private String member;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getChinaMenber() {
        return chinaMenber;
    }

    public void setChinaMenber(String chinaMenber) {
        this.chinaMenber = chinaMenber;
    }


    public String getProbationary() {
        return probationary;
    }

    public void setProbationary(String probationary) {
        this.probationary = probationary;
    }


    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }


    public String getPatriots() {
        return patriots;
    }

    public void setPatriots(String patriots) {
        this.patriots = patriots;
    }


    public String getMassess() {
        return massess;
    }

    public void setMassess(String massess) {
        this.massess = massess;
    }


    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }


    public String getAlliance() {
        return alliance;
    }

    public void setAlliance(String alliance) {
        this.alliance = alliance;
    }


    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PoliticsStatusEntity that = (PoliticsStatusEntity) o;
        return id == that.id &&
                Objects.equals(chinaMenber, that.chinaMenber) &&
                Objects.equals(probationary, that.probationary) &&
                Objects.equals(league, that.league) &&
                Objects.equals(patriots, that.patriots) &&
                Objects.equals(massess, that.massess) &&
                Objects.equals(party, that.party) &&
                Objects.equals(alliance, that.alliance) &&
                Objects.equals(member, that.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chinaMenber, probationary, league, patriots, massess, party, alliance, member);
    }
}
