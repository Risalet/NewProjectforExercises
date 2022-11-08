package com.newproject.multithreadingdemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiGoogleSearch implements Runnable {
    private String searchWord;

    public MultiGoogleSearch(String searchWord) {
        this.searchWord = searchWord;
    }

    @Override
    public void run() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys(searchWord+ Keys.ENTER);
        String webElementResult = driver.findElement(By.id("result-stats")).getText();
        System.out.println(webElementResult);
    }
}
