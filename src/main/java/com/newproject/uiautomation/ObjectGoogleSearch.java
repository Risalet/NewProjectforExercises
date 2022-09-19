package com.newproject.uiautomation;

import com.google.common.base.CharMatcher;
import com.newproject.object.SearchWord;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectGoogleSearch {
    public static void main(String[] args) {
        //define web driver location
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        SearchWord searchWord=new SearchWord();

        for (int i = 0; i < 3; i++) {
            driver.findElement(By.name("q")).sendKeys( searchWord.getSearch()[i]+ Keys.ENTER);
            String webElementResult = driver.findElement(By.id("result-stats")).getText();
            System.out.println(webElementResult);
            String theDigits = CharMatcher.digit().retainFrom(webElementResult);
            long WebElementResult = Long.parseLong(theDigits);
            System.out.println(WebElementResult);
            System.out.println(Arrays.toString(SearchWord.getSearch()));
            if (WebElementResult > 1) {
                System.out.println("This test is passed");
            } else
                System.out.println("This test not passed");
            driver.navigate().back();
        }
        driver.close();
        driver.quit();

    }
}







