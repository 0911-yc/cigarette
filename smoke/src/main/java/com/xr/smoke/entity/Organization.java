package com.xr.smoke.entity;

import java.io.Serializable;

public class Organization implements Serializable {
    private Integer id;

    private String organizationname;

    private String organizationhead;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrganizationname() {
        return organizationname;
    }

    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname == null ? null : organizationname.trim();
    }

    public String getOrganizationhead() {
        return organizationhead;
    }

    public void setOrganizationhead(String organizationhead) {
        this.organizationhead = organizationhead == null ? null : organizationhead.trim();
    }
}