package com.newproject.dropdownhandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClassDemo1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1665596389&extra_1=s%7Cc%7C321610682049%7Ce%7Cfacebook%7C&placement=&creative=321610682049&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1665596389%26adgroupid%3D65075436220%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D1009540%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwyt-ZBhCNARIsAKH1176ooeIIJ1UycL1nHdWJ1VptvVcEEW9yvzcOqt2emGLjs7JGf1TzR2oaAmhsEALw_wcB");
        WebElement day = driver.findElement(By.id("day"));
        selectDropDownListByGetOptions(day,"11");

    }

    public static void  selectDropDownListByGetOptions(WebElement element, String value) {
        Select s = new Select(element);
        List<WebElement> options = s.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
            String value1 = options.get(i).getText();
            if (value1.equalsIgnoreCase(value)) {
                options.get(i).click();
                break;
            }
        }

    }
}