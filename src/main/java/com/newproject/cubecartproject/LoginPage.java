package com.newproject.cubecartproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends TestBase{

  public void login (LoginUser loginUser){
      WebElement userNameElement=  driver.findElement(By.id("username"));
      waitForElementVisibility(userNameElement);
      userNameElement.sendKeys(loginUser.getUserName());

      WebElement passwordElement=  driver.findElement(By.id("password"));
      waitForElementVisibility(passwordElement);
      passwordElement.sendKeys(loginUser.getPassword());

      WebElement loginElement=  driver.findElement(By.id("login"));
      waitForElementVisibility(loginElement);
      loginElement.click();
    }

}
