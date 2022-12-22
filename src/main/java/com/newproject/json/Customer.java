package com.newproject.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    @JsonProperty("customerName")
    private String customerName;
    @JsonProperty("customerId")
    private String customerId;
    @JsonProperty("customerPhone")
    private String customerPhone;
    @JsonProperty("customerEmail")
    private String customerEmail;
    @JsonProperty("customerCellPhone")
    private String customerCellPhone;
    @JsonProperty("customerNewPassword")
    private String customerNewPassword;

    public Customer() {
    }

    public Customer(String customerName, String customerId, String customerPhone, String customerEmail, String customerCellPhone, String customerNewPassword) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerCellPhone = customerCellPhone;
        this.customerNewPassword = customerNewPassword;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerCellPhone() {
        return customerCellPhone;
    }

    public void setCustomerCellPhone(String customerCellPhone) {
        this.customerCellPhone = customerCellPhone;
    }

    public String getCustomerNewPassword() {
        return customerNewPassword;
    }

    public void setCustomerNewPassword(String customerNewPassword) {
        this.customerNewPassword = customerNewPassword;
    }
}
