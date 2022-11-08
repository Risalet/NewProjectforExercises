package com.newproject.cubecartproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewslettersPage extends TestBase{

    public void clickOnCreateNewsletterButton(){
        WebElement createNewsletterButton= driver.findElement(By.linkText("Create Newsletter"));
        waitForElementVisibility(createNewsletterButton);
         createNewsletterButton.click();
    }

    public void fillOutNewsletterInfo(){
        WebElement newsletterSubject= driver.findElement(By.id("email_subject"));
        waitForElementVisibility(newsletterSubject);
        newsletterSubject.sendKeys("Java");

        WebElement htmlContentButton=driver.findElement(By.xpath("//*[@id=\"tab_email_html\"]/a"));
        waitForElementVisibility(htmlContentButton);
        htmlContentButton.click();

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe")));
        WebElement field=driver.findElement(By.xpath("/html/body"));
        field.sendKeys("book");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@value='Save']")).click();
    }

    public void createNewsletter(){
        clickOnCreateNewsletterButton();
        fillOutNewsletterInfo();

    }



}
