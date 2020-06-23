package com.xr.smoke.entity;

import lombok.Data;

import java.util.Objects;

@Data
public class EducationEntity {
    private int id;
    private String education;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationEntity that = (EducationEntity) o;
        return id == that.id &&
                Objects.equals(education, that.education);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, education);
    }
}
