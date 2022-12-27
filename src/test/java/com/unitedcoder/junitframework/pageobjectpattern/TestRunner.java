package com.unitedcoder.junitframework.pageobjectpattern;

import com.newproject.TestBase;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRunner extends TestBase {
    static LoginPage loginPage;
    static DashBoardPage dashBoardPage;
    static CustomerPage customerPage;

    @BeforeClass
    public static void setUp() {
        browserSetUp();
        loginPage = new LoginPage(driver);
        dashBoardPage = new DashBoardPage(driver);
        customerPage = new CustomerPage(driver);

        loginPage.login(ReadFromFiles.readFromPropertiesFile("config.properties", "username"),
                ReadFromFiles.readFromPropertiesFile("config.properties", "password"));
    }

    @Test
    public void addCustomerTest() {
        dashBoardPage.clickOnCustomersLink();
        customerPage.addCustomer();
        Assert.assertTrue(customerPage.verifyCustomerAddedSuccessfully());
    }

    @Test
    public void deleteCustomerTest() {
        dashBoardPage.clickOnCustomersLink();
        customerPage.deleteSpecificCustomer();
        Assert.assertTrue(customerPage.verifyCustomerDeletedSuccessfully());
    }

    @Test
    public void viewCustomersTest() {
        dashBoardPage.clickOnCustomersLink();
        boolean isCustomerDisPlayed = customerPage.viewCustomers();
        Assert.assertTrue(isCustomerDisPlayed);
    }

    @AfterClass
    public static void tearDown(){
        closeBrowser();
    }

}
