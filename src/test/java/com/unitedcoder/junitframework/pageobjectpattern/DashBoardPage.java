package com.unitedcoder.junitframework.pageobjectpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

    WebDriver driver;
    TestUtility testUtility;

    @FindBy(linkText = "Customer List")
    WebElement customerListLink;

    @FindBy(id="nav_categories")
    WebElement categoriesLink;

    @FindBy(id="nav_products")
    WebElement productsLink;

    @FindBy(xpath="//*[contains(text(),'Log Out')]")//(css="i.fa.fa-sign-out")
    WebElement logoutButton;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        testUtility=new TestUtility(driver);
    }

    public boolean verifyLogin(){
        testUtility.waitForElementPresent(logoutButton);
        return logoutButton.isDisplayed();
    }

    public void clickOnCustomersLink(){
        testUtility.waitForElementPresent(customerListLink);
        customerListLink.click();
    }
    public void clickOnProductsLink(){
        testUtility.waitForElementPresent(productsLink);
        productsLink.click();
    }
    public void clickOnCategoriesLink(){
        testUtility.waitForElementPresent(categoriesLink);
        categoriesLink.click();
    }

    public void clickOnLogoutButton(){
        testUtility.waitForElementPresent(logoutButton);
        logoutButton.click();
    }
}
