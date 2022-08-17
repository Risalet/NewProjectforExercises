package com.newproject.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaharaLogOutDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.mahara.org/");
        driver.findElement(By.id("login_login_username")).sendKeys("admin");
        driver.findElement(By.id("login_login_password")).sendKeys("MaharaDemo");
        driver.findElement(By.id("login_submit")).click();
        driver.findElement( By.xpath("//span[@class='icon icon-chevron-down collapsed']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),\"Logout\")]")).click();
        WebElement logoutResult=driver.findElement(By.xpath("//*[contains(text(),\"You have been logged out successfully\")]"));
        if (logoutResult.getText().equalsIgnoreCase("You have been logged out successfully")){
            System.out.println("This test is passed");
        }else
            System.out.println("This test is failed");
    }
}
