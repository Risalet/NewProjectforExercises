package com.newproject.exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearch1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver;
        driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/index.htm");
        System.out.println("Pop-up blocked");

    }
}
