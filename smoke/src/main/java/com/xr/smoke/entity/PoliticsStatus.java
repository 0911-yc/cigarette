package com.xr.smoke.entity;

import java.io.Serializable;

public class PoliticsStatus implements Serializable {
    private Integer id;

    private String chinamenber;

    private String probationary;

    private String league;

    private String patriots;

    private String massess;

    private String party;

    private String alliance;

    private String member;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChinamenber() {
        return chinamenber;
    }

    public void setChinamenber(String chinamenber) {
        this.chinamenber = chinamenber == null ? null : chinamenber.trim();
    }

    public String getProbationary() {
        return probationary;
    }

    public void setProbationary(String probationary) {
        this.probationary = probationary == null ? null : probationary.trim();
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league == null ? null : league.trim();
    }

    public String getPatriots() {
        return patriots;
    }

    public void setPatriots(String patriots) {
        this.patriots = patriots == null ? null : patriots.trim();
    }

    public String getMassess() {
        return massess;
    }

    public void setMassess(String massess) {
        this.massess = massess == null ? null : massess.trim();
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party == null ? null : party.trim();
    }

    public String getAlliance() {
        return alliance;
    }

    public void setAlliance(String alliance) {
        this.alliance = alliance == null ? null : alliance.trim();
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
    }
}