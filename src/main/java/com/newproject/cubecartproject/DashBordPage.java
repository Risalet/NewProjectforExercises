package com.newproject.cubecartproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashBordPage extends TestBase {
    public boolean logout() {
        WebElement logoutIcon = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        waitForElementVisibility(logoutIcon);
        logoutIcon.click();
        if (logoutIcon.isDisplayed()) {
            System.out.println("user logged in");
            return true;
        } else {
            System.out.println("user login failed");
            return false;
        }
    }


    public void clickOnCategoriesLink(){
        WebElement categoriesLink = driver.findElement(By.id("nav_categories"));
        waitForElementVisibility(categoriesLink);
        categoriesLink.click();
    }

    public void newslettersLink(){
        WebElement newslettersLink =driver.findElement(By.linkText("Newsletters"));
        waitForElementVisibility(newslettersLink);
        newslettersLink.click();
    }
}
