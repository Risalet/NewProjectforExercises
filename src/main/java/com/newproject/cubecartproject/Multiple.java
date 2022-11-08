package com.newproject.cubecartproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Multiple extends TestBase {
    public static void main(String[] args) {
        browserSetUp();
        LoginUser loginUser = new LoginUser("testautomationprod1", "automation123!");
        LoginPage loginPage = new LoginPage();
        loginPage.login(loginUser);
        DashBordPage dashBordPage = new DashBordPage();
        dashBordPage.clickOnCategoriesLink();
        int rowCount = driver.findElements(By.xpath("//*[@class='reorder-list ui-sortable']//tr")).size();
        int columnCount = driver.findElements(By.xpath("//*[@class='reorder-list ui-sortable']//td[5]")).size();
        System.out.println(rowCount);
        System.out.println(columnCount);
        for (int i = 1; i < rowCount; i++) {
            for (int j = 1; j <= columnCount; j++) {


            }
        }
    }
}