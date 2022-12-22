package com.newproject.cubecartproject;

import com.newproject.LoginPage;
import com.newproject.TestBase;
import com.newproject.LoginUser;
import org.openqa.selenium.By;

public class Multiple extends TestBase {
    public static void main(String[] args) {
        browserSetUp();
        LoginPage.loginCubeCart();
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