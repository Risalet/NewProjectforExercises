package com.newproject.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
// if json have change must add @JsonIgnoreProperties annotation code execute successfully
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
