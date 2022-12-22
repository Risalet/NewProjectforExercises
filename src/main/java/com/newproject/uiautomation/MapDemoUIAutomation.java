package com.newproject.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemoUIAutomation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Map<String,String> website=new HashMap<>();
        website.put("Google","https://www.google.com");
        website.put("YouTube","https://www.youtube.com");
        website.put("Yahoo","https://www.yahoo.com");

        System.out.println("Total websites to test : "+website.size());
        Set<String> sites=website.keySet();
        for (String site: sites){
            System.out.println(site);
            System.out.printf("Site under test %s%n",website.get(site));
            driver.get(website.get(site));
            String siteTitle=driver.getTitle();
            if (siteTitle.contains(site)){
                System.out.println("Test is passed");
            }
            else
                System.out.println("Test is failed");
        }
        driver.close();
        driver.quit();
    }
}
