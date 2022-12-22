package com.newproject.json.addcustomertest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Users {

    @JsonProperty("users")
    private List<User> user;

    public Users() {
    }

    public Users(List<User> user) {
        this.user = user;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
