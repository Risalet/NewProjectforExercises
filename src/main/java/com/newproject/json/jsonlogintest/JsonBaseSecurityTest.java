package com.newproject.json.jsonlogintest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.newproject.LoginPage;
import com.newproject.TestBase;
import com.newproject.cubecartproject.DashBordPage;
import com.newproject.json.DateTimeFunctions;
import com.newproject.json.User;
import com.newproject.json.Users;
import com.newproject.json.testresult.TestResultObject;
import com.newproject.json.testresult.TestResult;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonBaseSecurityTest extends TestBase {
    public static void main(String[] args) {
        DashBordPage dashBordPage = new DashBordPage();
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectMapper objectMapper1 = new ObjectMapper();
        TestResult testResult=new TestResult();
        TestResultObject testResultObject=new TestResultObject();

        browserSetUp();

        String startTime = DateTimeFunctions.getToday() + " " + DateTimeFunctions.getCurrentTime();
        testResult.setTestStartTime(startTime);
        //for current user
        testResult.setTestExecutedBy(DateTimeFunctions.getCurrentUser());


        Users users;

        {
            try {
                users = objectMapper.readValue(new File("json.File/Users.json"), Users.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            List<TestResultObject> testResultObjects=new ArrayList<>();
            List<User> user = users.getUser();
            for (User eachUser : user) {

                testResultObject.setTestName("Login-Test");
                testResultObject.setTestModule("Role-Based-Security-Test");
                testResultObject.setTestDate(DateTimeFunctions.getToday());
                testResultObject.setTestTime(DateTimeFunctions.getCurrentTime());

                LoginPage.login(eachUser.getUserName(), eachUser.getPassword());
                WebElement categoriesLink = driver.findElement(By.id("nav_categories"));
                if (categoriesLink.isDisplayed()){
                    System.out.println("Login test Passed");
                    testResultObject.setTestStatus(true);}
                else{
                    testResultObject.setTestStatus(false);

                }
                dashBordPage.logout();
                testResultObjects.add(testResultObject);
            }
            closeBrowser();

            testResult.setTestEndTime(DateTimeFunctions.getCurrentTime());
            testResult.setTestResultObjects(testResultObjects);

            try {
                objectMapper1.writeValue(new File("json.File/login-test-result.json"),testResult);
                testResult.setTestResultObjects(testResultObjects);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}