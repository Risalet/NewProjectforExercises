package com.newproject.cubecartproject;

import com.newproject.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddProductPage extends TestBase {

    public static boolean addProduct() {
        WebElement clickOnAddProductButton= driver.findElement(By.xpath("//*[text()='Add Product']"));//(By.linkText("Add Product"))
        waitForElementVisibility(clickOnAddProductButton);
        clickOnAddProductButton.click();

        WebElement productName= driver.findElement(By.name("name"));
        waitForElementVisibility(productName);
        productName.sendKeys("Java123");

        WebElement productConditionSelect = driver.findElement(By.id("condition"));
        waitForElementVisibility(productConditionSelect);
        selectDropDownListValueRandomly(productConditionSelect);

        WebElement productCode = driver.findElement(By.id("product_code"));
        waitForElementVisibility(productCode);
        productCode.sendKeys("12345fghjkkml");

        WebElement saveButton= driver.findElement(By.cssSelector("input[value='Save']"));
        waitForElementVisibility(saveButton);
        saveButton.click();

        WebElement successMessage = driver.findElement(By.cssSelector("div.success"));
        if (successMessage.isDisplayed()) {
            System.out.println("Add product is successfully");
            return true;
        } else
            System.out.println("Add product is failed");
        return false;
    }
}
