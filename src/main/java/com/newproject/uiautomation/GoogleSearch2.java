package com.newproject.uiautomation;

import com.google.common.base.CharMatcher;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //Set browser size
        Dimension dimension=new Dimension(600,700);
        driver.manage().window().setSize(dimension);
        Point point=new Point(300 ,200);
        driver.manage().window().setPosition(point);
        WebElement searchBox=driver.findElement(By.name("q"));
        Point p1=searchBox.getLocation();
        int xCoordination=p1.x;
        int yCoordination=p1.y;
        System.out.println(xCoordination);
        System.out.println(yCoordination);



    }

}
