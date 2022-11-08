package com.newproject.javafile.configproperties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class UIUtility {
    private int timeOut=Integer.parseInt
            (ApplicationConfigMethod.readFromPropertiesFile("config.properties","timeout"));

    private WebDriver driver;

    public UIUtility(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementPresent(WebElement element){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(timeOut));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void screenShotFile(String fileFolder, String fileName){
        TakesScreenshot screenShot= (TakesScreenshot)driver;
        File screenShotFile=screenShot.getScreenshotAs(OutputType.FILE);
        File myFile = new File(fileFolder + File.separator + fileName + System.currentTimeMillis() + ".png");
        System.out.println("My ScreenShot File is Created");

        try {
            FileUtils.copyFile(screenShotFile,myFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
