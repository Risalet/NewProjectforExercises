package com.newproject.uiautomation;

import com.google.common.base.CharMatcher;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class GoogleSearch1 {
    public static void main(String[] args) {
        //define web driver location
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Java" + Keys.ENTER);
        String webElementResult = driver.findElement(By.id("result-stats")).getText();
        String theDigits = CharMatcher.digit().retainFrom(webElementResult);
        long WebElementResult = Long.parseLong(theDigits);
        if (WebElementResult > 1) {
            System.out.println("This test is passed");
        }
        else
            System.out.println("This test not passed");
        driver.close();
        driver.quit();
    }
}









