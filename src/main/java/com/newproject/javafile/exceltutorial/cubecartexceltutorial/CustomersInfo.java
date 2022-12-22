package com.newproject.javafile.exceltutorial.cubecartexceltutorial;


public class CustomersInfo {
    private String customerTitle;
    private String customerFirstName;
    private String customerLastName;
    private String email;
    private int phone;
    private int cellPhone;
    private String newPassword;

    public CustomersInfo() {
    }

    public CustomersInfo(String customerTitle, String customerFirstName, String customerLastName, String email, int phone, int cellPhone, String newPassword) {
        this.customerTitle = customerTitle;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.email = email;
        this.phone = phone;
        this.cellPhone = cellPhone;
        this.newPassword = newPassword;
    }

    public String getCustomerTitle() {
        return customerTitle;
    }

    public void setCustomerTitle(String customerTitle) {
        this.customerTitle = customerTitle;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public String toString() {
        return "CustomersInfo{" +
                "customerTitle='" + customerTitle + '\'' +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", cellPhone=" + cellPhone +
                ", newPassword='" + newPassword + '\'' +
                '}';
    }
}