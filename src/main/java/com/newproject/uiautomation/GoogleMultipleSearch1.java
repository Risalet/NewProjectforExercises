package com.newproject.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMultipleSearch1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
//        for (int i=0;i<3;i++){
//            driver.findElement(By.name("q")).sendKeys(args[i]+ Keys.ENTER);
//            Thread.sleep(2000);
//            driver.navigate().back();
//        }
        for (String keyWord:args)
            driver.findElement(By.name("q")).sendKeys(keyWord+ Keys.ENTER);
            Thread.sleep(2000);
            driver.navigate().back();

        driver.close();
        driver.quit();


    }
}
