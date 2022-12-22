package com.newproject;

import com.newproject.javafile.exceltutorial.readexcelfile.ExcelUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends TestBase {

    public static void login (String username, String password ){
        WebElement userNameElement=  driver.findElement(By.id("username"));
        waitForElementVisibility(userNameElement);
        userNameElement.sendKeys(username);

        WebElement passwordElement=  driver.findElement(By.id("password"));
        waitForElementVisibility(passwordElement);
        passwordElement.sendKeys(password);

        WebElement loginElement=  driver.findElement(By.id("login"));
        waitForElementVisibility(loginElement);
        loginElement.click();

    }

    public static void login (LoginUser loginUser){
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

    public static void loginCubeCart(){
        String fileName="Test-Data/MyDoc.xlsx";
        ExcelUtility excelUtility=new ExcelUtility();
        String userName=excelUtility.readFromExcelCell(fileName,"LoginInfo",1,0);
        String password=excelUtility.readFromExcelCell(fileName,"LoginInfo",1,1);
        LoginPage.login(userName,password);

    }
}
