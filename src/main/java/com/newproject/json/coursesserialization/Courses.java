package com.newproject.json.coursesserialization;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Courses {

    @JsonProperty ("WebAutomation")
    private List<WebAutomation> webAutomation;

    @JsonProperty("APi")
    private List<API> api;

    public Courses() {
    }

    public Courses(List<WebAutomation> webAutomation, List<API> api) {
        this.webAutomation = webAutomation;
        this.api = api;
    }

    public List<WebAutomation> getWebAutomation() {
        return webAutomation;
    }

    public void setWebAutomation(List<WebAutomation> webAutomation) {
        this.webAutomation = webAutomation;
    }

    public List<API> getApi() {
        return api;
    }

    public void setApi(List<API> api) {
        this.api = api;
    }
}
