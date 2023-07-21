package com.products.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserResponse {
    @JsonProperty("results")
    private List<User> users;

    private Info info;

    public UserResponse() {
    }

    public UserResponse(List<User> users, Info info) {
        this.users = users;
        this.info = info;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "users=" + users +
                ", info=" + info +
                '}';
    }
}
