package com.newproject.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.co.jp/");
        String[] product={"iphone","ipad","laptop"};
        for (String keyWord :product){
            WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys(keyWord+ Keys.ENTER);
            driver.navigate().back();
        }

        driver.close();
        driver.quit();

    }

}
