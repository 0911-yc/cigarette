package com.xr.smoke.entity;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Objects;

@Component
public class DatumEntity {
    private int id;
    private String title;
    private String fileName;
    private String file;
    private Timestamp creationTime;
    private String creator;
    private Integer status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
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


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatumEntity that = (DatumEntity) o;
        return id == that.id &&
                Objects.equals(title, that.title) &&
                Objects.equals(fileName, that.fileName) &&
                Objects.equals(file, that.file) &&
                Objects.equals(creationTime, that.creationTime) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, fileName, file, creationTime, creator, status);
    }
}
