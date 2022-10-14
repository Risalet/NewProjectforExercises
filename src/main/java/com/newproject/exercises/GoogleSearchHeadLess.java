package com.newproject.exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class GoogleSearchHeadLess {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        //headless parameter
        chromeOptions.addArguments("headless");
        // set parameter to Chrome driver
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://www.tutorialspoint.com/questions/index.php");
        // obtain page title
        System.out.println("Page title without browser: " + driver.getTitle());
        driver.quit();
    }
}