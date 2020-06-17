package com.xr.smoke.entity;

import java.sql.Timestamp;
import java.util.Objects;


public class PostEntity {
    private int id;
    private Integer postId;
    private String postName;
    private Timestamp time;
    private String creator;
    private Integer postStatus;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }


    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }


    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }


    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


    public Integer getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(Integer postStatus) {
        this.postStatus = postStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostEntity that = (PostEntity) o;
        return id == that.id &&
                Objects.equals(postId, that.postId) &&
                Objects.equals(postName, that.postName) &&
                Objects.equals(time, that.time) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(postStatus, that.postStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, postId, postName, time, creator, postStatus);
    }
}
