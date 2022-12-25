package com.unitedcoder.junitframework;

import com.newproject.LoginPage;
import com.newproject.TestBase;
import com.newproject.cubecartproject.AddProductPage;
import com.newproject.cubecartproject.DashBordPage;
import com.newproject.javafile.exceltutorial.cubecartexceltutorial.AddCustomerPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CubeCartJUnitFramework extends TestBase {
    DashBordPage dashBordPage=new DashBordPage();

    @BeforeClass
    public static void setUp(){
        browserSetUp();
        LoginPage.loginCubeCart();
    }
    @Test
    public void viewCustomers(){
        dashBordPage.clickOnCustomerListLink();
        AddCustomerPage.viewCustomers();
        Assert.assertTrue(true);
    }

    @Test
    public void addProduct(){
        dashBordPage.clickOnProductsLink();
        AddProductPage.addProduct();
        Assert.assertTrue(true);
    }

    @AfterClass
    public static void tearDown(){
        closeBrowser();
    }
}
