package com.newproject.javafile.exceltutorial.cubecartexceltutorial;

import com.newproject.TestBase;
import com.newproject.cubecartproject.DashBordPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AddCustomerPage extends TestBase {

    public static void fillOutAddCustomerDetails(CustomersInfo customersInfo){
        DashBordPage dashBordPage=new DashBordPage();
        dashBordPage.clickOnCustomerListLink();
        dashBordPage.clickOnAddCustomerButton();

        WebElement customerTitleBox=driver.findElement(By.id("cust-title"));
        waitForElementVisibility(customerTitleBox);
        customerTitleBox.sendKeys(customersInfo.getCustomerTitle());

        WebElement customerFirstNameBox= driver.findElement(By.id("cust-firstname"));
        waitForElementVisibility(customerFirstNameBox);
        customerFirstNameBox.sendKeys(customersInfo.getCustomerFirstName());

        WebElement customerLastNameBox= driver.findElement(By.id("cust-lastname"));
        waitForElementVisibility(customerLastNameBox);
        customerLastNameBox.sendKeys(customersInfo.getCustomerLastName());

        WebElement emailBox= driver.findElement(By.id("cust-email"));
        waitForElementVisibility(emailBox);
        emailBox.sendKeys(customersInfo.getEmail()+System.currentTimeMillis());

        WebElement phoneBox= driver.findElement(By.id("cust-phone"));
        waitForElementVisibility(phoneBox);
        phoneBox.sendKeys( customersInfo.toString());

        WebElement cellPhoneBox= driver.findElement(By.id("cust-mobile"));
        waitForElementVisibility(cellPhoneBox);
        cellPhoneBox.sendKeys(customersInfo.toString());

        WebElement newPasswordBox= driver.findElement(By.id("cust-password"));
        waitForElementVisibility(newPasswordBox);
        newPasswordBox.sendKeys(customersInfo.getNewPassword());

        WebElement clickOnSaveButton= driver.findElement(By.name("save"));
        waitForElementVisibility(clickOnSaveButton);
        clickOnSaveButton.click();
    }

    public static void addMultiCustomer(){
        ReadCustomersInfoFromExcel readCustomersInfoFromExcel=new ReadCustomersInfoFromExcel();
        List<CustomersInfo> customers=readCustomersInfoFromExcel.getCustomersData("Test-Data/MyDoc.xlsx","CustomerInfo");
        System.out.println(customers);
        for (CustomersInfo customer: customers) {
            fillOutAddCustomerDetails(customer);
        }
    }

}
