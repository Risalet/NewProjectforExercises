package com.unitedcoder.junitframework.pageobjectpattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CustomerPage {

    WebDriver driver;
    TestUtility testUtility;
    String customerName;

    @FindBy(linkText = "Add Customer")
    WebElement addCustomerButton;

    @FindBy(xpath = "//img[@title='Enable' and @class='checkbox cbs']")
    WebElement statusCheckBox;

    @FindBy(id = "cust-title")
    WebElement titleBox;

    @FindBy(id = "cust-firstname")
    WebElement firstName;

    @FindBy(id = "cust-lastname")
    WebElement lastName;

    @FindBy(id = "cust-type")
    WebElement typeDropDown;

    @FindBy(id = "cust-email")
    WebElement emailBox;

    @FindBy(id = "cust-phone")
    WebElement phoneBox;

    @FindBy(id = "cust-mobile")
    WebElement cellPhoneBox;

    @FindBy(id = "subscription_status")
    WebElement subscribedToNewsletterDropDown;

    @FindBy(id = "cust-password")
    WebElement newPasswordBox;

    @FindBy(name = "save")
    WebElement saveButton;

    @FindBy(xpath = "//*[text()='Customer successfully added.']")
    WebElement successMassage;

    @FindBy(css="div.success")
    WebElement deleteSuccessMassage;

    @FindAll(
            @FindBy(xpath = "//*[@id=\"customer-list\"]/table/tbody/tr")
    )
    List<WebElement> customerList;

    @FindBy(xpath = "//*[@id=\"customer-list\"]/table")
    WebElement customersListTable;

    String beforeXpath="//*[@id='customer-list']/table/tbody/tr[";
    String customerNameAfterXpath="]/td[4]/a";
    String deleteIconAfterXpath= "]/td[8]/a[3]/i";




    public CustomerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        testUtility = new TestUtility(driver);
    }

    public void addCustomer() {
        testUtility.waitForElementPresent(addCustomerButton);
        addCustomerButton.click();

        testUtility.waitForElementPresent(statusCheckBox);
        statusCheckBox.click();

        testUtility.waitForElementPresent(titleBox);
        titleBox.sendKeys(testUtility.generateTile());

        customerName=testUtility.generateFakerFirstName();
        testUtility.waitForElementPresent(firstName);
        firstName.sendKeys(customerName);

        testUtility.waitForElementPresent(lastName);
        lastName.sendKeys(testUtility.generateFakerLastName());

        testUtility.waitForElementPresent(typeDropDown);
        testUtility.selectDropDownRandomly(typeDropDown);

        testUtility.waitForElementPresent(emailBox);
        emailBox.sendKeys(testUtility.randomEmail());

        testUtility.waitForElementPresent(phoneBox);
        phoneBox.sendKeys(testUtility.generatePhoneNumber());

        testUtility.waitForElementPresent(cellPhoneBox);
        cellPhoneBox.sendKeys(testUtility.generateCellPhoneNumber());

        testUtility.waitForElementPresent(subscribedToNewsletterDropDown);
        testUtility.selectDropDownRandomly(subscribedToNewsletterDropDown);

        testUtility.waitForElementPresent(newPasswordBox);
        newPasswordBox.sendKeys(testUtility.generatePassword());

        testUtility.waitForElementPresent(saveButton);
        saveButton.click();
    }

    public boolean verifyCustomerAddedSuccessfully() {
        testUtility.waitForElementPresent(successMassage);
        return successMassage.isDisplayed();
    }

    public void deleteSpecificCustomer(){
        int customerLists=driver.findElements(By.xpath("//*[@id=\"customer-list\"]/table/tbody/tr")).size();
        System.out.println("CustomerName is: "+customerName);
        TestUtility.sleep(3);
        for(int i=1;i<customerLists;i++){
            String customerText=driver.findElement(By.xpath(beforeXpath+i+customerNameAfterXpath)).getText();
            if(customerText.contains(customerName)){
                WebElement deleteIcon=driver.findElement(By.xpath(beforeXpath+i+deleteIconAfterXpath));
                deleteIcon.click();
                Alert alert=driver.switchTo().alert();
                alert.accept();
            }
        }
    }

    public boolean verifyCustomerDeletedSuccessfully() {
        testUtility.waitForElementPresent(deleteSuccessMassage);
        return deleteSuccessMassage.isDisplayed();
    }

    public boolean viewCustomers(){

        testUtility.waitForElementPresent(customersListTable);
        return customerList.size()>1;


    }


}
