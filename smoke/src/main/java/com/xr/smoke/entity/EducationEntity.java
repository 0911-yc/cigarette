package com.xr.smoke.entity;

import java.util.Objects;


public class EducationEntity {
    private int id;
    private String primary;
    private String junior;
    private String colleges;
    private String undergraduate;
    private String master;
    private String doctor;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }


    public String getJunior() {
        return junior;
    }

    public void setJunior(String junior) {
        this.junior = junior;
    }


    public String getColleges() {
        return colleges;
    }

    public void setColleges(String colleges) {
        this.colleges = colleges;
    }


    public String getUndergraduate() {
        return undergraduate;
    }

    public void setUndergraduate(String undergraduate) {
        this.undergraduate = undergraduate;
    }


    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }


    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationEntity that = (EducationEntity) o;
        return id == that.id &&
                Objects.equals(primary, that.primary) &&
                Objects.equals(junior, that.junior) &&
                Objects.equals(colleges, that.colleges) &&
                Objects.equals(undergraduate, that.undergraduate) &&
                Objects.equals(master, that.master) &&
                Objects.equals(doctor, that.doctor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, primary, junior, colleges, undergraduate, master, doctor);
    }
}
