package com.newproject.cubecartproject;

import com.newproject.LoginPage;
import com.newproject.TestBase;

public class CubeCartTestRunner1 extends TestBase {
    public static void main(String[] args) {
        browserSetUp();
        LoginPage.loginCubeCart();
        DashBordPage dashBordPage = new DashBordPage();
        dashBordPage.clickOnCategoriesLink();
        CategoriesPage categoriesPage = new CategoriesPage();
        categoriesPage.addCategory();
        dashBordPage.newslettersLink();
        NewslettersPage newslettersPage=new NewslettersPage();
        newslettersPage.createNewsletter();
        closeBrowser();
    }
}
