package com.newproject.cubecartproject;

public class CubecarTestRunner1 extends TestBase{
    public static void main(String[] args) {
        browserSetUp();
        LoginUser loginUser=new LoginUser("testautomationprod1","automation123!");
        LoginPage loginPage=new LoginPage();
        loginPage.login(loginUser);
        DashBordPage dashBordPage=new DashBordPage();
        dashBordPage.clickOnCategoriesLink();
        CategoriesPage categoriesPage=new CategoriesPage();
        categoriesPage.addCategory();





    }
}
