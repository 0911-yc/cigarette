package com.xr.smoke.entity;

import java.util.Objects;


public class OrganizationEntity {
    private int id;
    private String organizationName;
    private String organizationHead;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }


    public String getOrganizationHead() {
        return organizationHead;
    }

    public void setOrganizationHead(String organizationHead) {
        this.organizationHead = organizationHead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganizationEntity that = (OrganizationEntity) o;
        return id == that.id &&
                Objects.equals(organizationName, that.organizationName) &&
                Objects.equals(organizationHead, that.organizationHead);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, organizationName, organizationHead);
    }
}
