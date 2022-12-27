package com.unitedcoder.junitframework.pageobjectpattern;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class TestUtility {
    private int timeOut = Integer.parseInt(ReadFromFiles.readFromPropertiesFile
            ("config.properties", "timeout"));

    private WebDriver driver;

    public TestUtility(WebDriver driver) {
        this.driver = driver;
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitForElementPresent(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void waitForAlertPresent(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public String generateFakerFirstName(){
        Faker faker=new Faker();
        return faker.name().firstName();
    }

    public String generateFakerLastName(){
        Faker faker=new Faker();
        return faker.name().lastName();
    }

    public String randomEmail(){
        String generateString= RandomStringUtils.randomAlphabetic(8);
        return generateString+"@gmail.com";
    }

    public String generatePhoneNumber(){
        Faker faker=new Faker();
       return faker.phoneNumber().phoneNumber();
    }

    public String generateCellPhoneNumber(){
        Faker faker=new Faker();
        return faker.phoneNumber().cellPhone();
    }

    public String generateTile(){
        Faker faker=new Faker();
        return faker.name().title();
    }

    public String generatePassword(){
       return RandomStringUtils.randomAlphabetic(4)+
               RandomStringUtils.randomNumeric(4);
    }

    public void  selectDropDownRandomly(WebElement element) {
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