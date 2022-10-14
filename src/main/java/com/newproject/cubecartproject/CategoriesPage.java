package com.newproject.cubecartproject;

import com.newproject.dropdownhandling.SelectClassUseRandom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoriesPage extends TestBase {

    public void clickOnAddCategoryButton() {
        WebElement addCategoryButton = driver.findElement(By.xpath("//div[@class='tab']//*"));
        waitForElementVisibility(addCategoryButton);
        addCategoryButton.click();
    }

    public void fillOutCategoryDetails() {
        WebElement statusCheckBox = driver.findElement(By.xpath("//img[@class='checkbox cbs'][1]"));
        waitForElementVisibility(statusCheckBox);
        statusCheckBox.click();

        WebElement visibleCheckBox = driver.findElement(By.xpath("(//img[@class='checkbox cbs'])[2]"));
        waitForElementVisibility(visibleCheckBox);
        visibleCheckBox.click();

        WebElement categoryName = driver.findElement(By.id("name"));
        waitForElementVisibility(categoryName);
        categoryName.sendKeys("Go--head");

        WebElement parentCategoryDropDown = driver.findElement(By.id("parent"));
        waitForElementVisibility(parentCategoryDropDown);
        selectDropDownListValueRandomly(parentCategoryDropDown);

        WebElement saveButton = driver.findElement(By.id("cat_save"));
        waitForElementVisibility(saveButton);
        saveButton.click();
    }
    public void addCategory(){
        clickOnAddCategoryButton();
        fillOutCategoryDetails();
    }
}
