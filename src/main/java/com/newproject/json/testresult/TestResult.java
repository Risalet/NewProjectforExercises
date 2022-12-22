package com.newproject.json.testresult;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TestResult {

    @JsonProperty("test")
    private List<TestResultObject> testResultObjects;

    @JsonProperty("test-start-time")
    private String testStartTime;

    @JsonProperty("test-end-time")
    private String testEndTime;

    @JsonProperty("test-executed-by")
    private String testExecutedBy;

    public TestResult() {
    }

    public TestResult(List<TestResultObject> testResultObjects, String testStartTime, String testEndTime, String testExecutedBy) {
        this.testResultObjects = testResultObjects;
        this.testStartTime = testStartTime;
        this.testEndTime = testEndTime;
        this.testExecutedBy = testExecutedBy;
    }

    public List<TestResultObject> getTestResultObjects() {
        return testResultObjects;
    }

    public void setTestResultObjects(List<TestResultObject> testResultObjects) {
        this.testResultObjects = testResultObjects;
    }

    public String getTestStartTime() {
        return testStartTime;
    }

    public void setTestStartTime(String testStartTime) {
        this.testStartTime = testStartTime;
    }

    public String getTestEndTime() {
        return testEndTime;
    }

    public void setTestEndTime(String testEndTime) {
        this.testEndTime = testEndTime;
    }

    public String getTestExecutedBy() {
        return testExecutedBy;
    }

    public void setTestExecutedBy(String testExecutedBy) {
        this.testExecutedBy = testExecutedBy;
    }
}

