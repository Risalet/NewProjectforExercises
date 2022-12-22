package com.newproject.cubecartproject;

import com.newproject.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashBordPage extends TestBase {
    public void logout() {
        WebElement logoutIcon = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        waitForElementVisibility(logoutIcon);
        logoutIcon.click();
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

    public void clickOnCustomerListLink(){
        WebElement customerListLink= driver.findElement(By.linkText("Customer List"));
        waitForElementVisibility(customerListLink);
        customerListLink.click();
    }

    public void clickOnAddCustomerButton(){
        WebElement addCustomerButton= driver.findElement(By.xpath("//*[@id=\"tab_control\"]/div[3]/a"));
        waitForElementVisibility(addCustomerButton);
        addCustomerButton.click();
    }
}
