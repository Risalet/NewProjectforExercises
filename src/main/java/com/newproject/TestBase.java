package com.newproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;


public class TestBase {
    public static WebDriver driver;
    public static String browserName="chrome";
    public static String  url="http://cubecartuat.unitedcoderschool.com/admin_wehelc.php";

    public static void browserSetUp(){
        if (driver == null) {
            if(browserName.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions=new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                //define chrome driver object instance
                driver = new ChromeDriver(chromeOptions);
                driver.manage().window().maximize();
                driver.get(url);
            }
            else if(browserName.equalsIgnoreCase("firefox")){
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions=new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                //define chrome driver object instance
                driver = new ChromeDriver(chromeOptions);
                driver.manage().window().maximize();
                driver.get(url);
            }
        }
    }

    public static void  closeBrowser(){
        driver.close();
        driver.quit();
    }

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds* 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //explicit wait  500 millisecond
    public static void waitForElementVisibility(WebElement element){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementToBeClickable(WebElement element){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //fluent wait
    public static void fluentWait(WebElement element){
        Wait<WebDriver> wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public static void  selectDropDownListValueRandomly(WebElement element) {
        Select s = new Select(element);
        Random rand = new Random();
        List<WebElement> options = s.getOptions();
        for (int i = 0; i < options.size(); i++) {
            int list = rand.nextInt(options.size());
//            System.out.println(list);
            options.get(list).click();
        }
    }
}
