package com.newproject.dropdownhandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1665596389&extra_1=s%7Cc%7C321610682049%7Ce%7Cfacebook%7C&placement=&creative=321610682049&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1665596389%26adgroupid%3D65075436220%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D1009540%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwyt-ZBhCNARIsAKH1176ooeIIJ1UycL1nHdWJ1VptvVcEEW9yvzcOqt2emGLjs7JGf1TzR2oaAmhsEALw_wcB");
        WebElement year=driver.findElement(By.id("year"));
        WebElement month=driver.findElement(By.id("month"));
        WebElement day=driver.findElement(By.id("day"));
//
//        Select s1=new Select(year);
//        s1.selectByVisibleText("1988");
//        Select s2=new Select(month);
//        s2.selectByValue("6");
//        Select s3=new Select(day);
//        s3.selectByIndex(4);
//
//        #1
//        selectDropDownListByValue(year,"1988");
//        selectDropDownListByValue(month,"6");
//        selectDropDownListByValue(day,"4");
//
//        #2
//        selectDroDownListByIndex(year,41);
//        selectDroDownListByIndex(month,5);
//        selectDroDownListByIndex(day,20);

//        #3
        selectDropDownListByText(year,"1950");
        selectDropDownListByText(month,"4月");
        selectDropDownListByText(day,"6");


    }
    //        #1
    public static void selectDropDownListByValue(WebElement element,String value){
        Select s=new Select(element);
        s.selectByValue(value);
    }
    //        #2
    public static void selectDroDownListByIndex(WebElement element,int index){
        Select s=new Select(element);
        s.selectByIndex(index);
    }
    //        #3
    public static void selectDropDownListByText(WebElement element,String text){
        Select s=new Select(element);
        s.selectByVisibleText(text);
    }


}
