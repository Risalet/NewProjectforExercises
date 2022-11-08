package com.newproject.javafile.configproperties;

import com.newproject.javafile.javaio.FileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartConfigDemo {
    static String configFile="config.properties";
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver= new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(ApplicationConfigMethod.readFromPropertiesFile(configFile, "qaurl"));
        UIUtility uiUtility=new UIUtility(driver);
        WebElement userNameElement = driver.findElement(By.id("username"));
        uiUtility.waitForElementPresent(userNameElement);
        userNameElement.sendKeys(ApplicationConfigMethod.readFromPropertiesFile(configFile, "username"));
        WebElement password = driver.findElement(By.id("password"));
        uiUtility.waitForElementPresent(password);
        password.sendKeys(ApplicationConfigMethod.readFromPropertiesFile(configFile, "password"));
        WebElement loginElement = driver.findElement(By.id("login"));
        uiUtility.waitForElementPresent(loginElement);
        loginElement.click();
        WebElement logoutIcon = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        uiUtility.waitForElementPresent(logoutIcon);

        if (logoutIcon.isDisplayed()) {
            StringBuilder result=new StringBuilder();
            result.append("Logout button displayed,CubeCart Login Successfully");
            FileUtility fileUtility=new FileUtility();
            fileUtility.fileUtils(ApplicationConfigMethod.readFromPropertiesFile(configFile, "fileFolder"),
                    ApplicationConfigMethod.readFromPropertiesFile(configFile, "fileName"), result.toString());
            uiUtility.screenShotFile(ApplicationConfigMethod.readFromPropertiesFile(configFile, "fileFolder"),
                    ApplicationConfigMethod.readFromPropertiesFile(configFile, "screenShotFileName"));
        }

        driver.close();
        driver.quit();
    }
}
