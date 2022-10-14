package com.newproject.cubecartproject;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class FunctionLibrary {
    public WebDriver driver;
    public void openBrowser(String url){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(url);
    }

    public boolean login(LoginUser loginUser){
        driver.findElement(By.id("username")).sendKeys(loginUser.getUserName());
        driver.findElement(By.id("password")).sendKeys(loginUser.getPassword());
        driver.findElement(By.id("login")).click();
        WebElement logoutIcon=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        if (logoutIcon.isDisplayed()){
            System.out.println("user logged in");
            return true;
        }else{
            System.out.println("user login failed");
            return false;
        }
    }

    public boolean addProduct(Product product) {
        driver.findElement(By.id("nav_products")).click();
        driver.findElement(By.linkText("Add Product")).click();
        driver.findElement(By.name("name")).sendKeys(product.getName());
        Select productConditionSelect = new Select(driver.findElement(By.id("condition")));
        productConditionSelect.selectByVisibleText(product.getCondition());
        driver.findElement(By.id("product_code")).sendKeys(product.getCode());
        driver.findElement(By.cssSelector("input[value='Save']")).click();
        WebElement successMessage = driver.findElement(By.cssSelector("div.success"));
        if (successMessage.isDisplayed()) {
            System.out.println("Add product is successfully");
            return true;
        } else
            System.out.println("Add product is failed");
        return false;
    }

    public void logout(){
        WebElement logoutIcon=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        logoutIcon.click();
    }

    public void tearDown(){
        driver.close();
        driver.quit();
    }

    public void waitUntilElementIsVisible(WebElement webElement){
        WebDriverWait webDriverWait=new WebDriverWait(driver,Duration.ofMillis(30));
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
