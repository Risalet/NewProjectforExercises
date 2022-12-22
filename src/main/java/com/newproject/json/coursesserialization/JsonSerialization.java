package com.newproject.json.coursesserialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonSerialization {
    public static void main(String[] args) {

        List<WebAutomation> webAutomationCourses=new ArrayList<>();
        webAutomationCourses.add(new WebAutomation("Selenium-Webdriver-java",50));
        webAutomationCourses.add(new WebAutomation("Cypress",50));
        webAutomationCourses.add(new WebAutomation("BDD-Cucumber-java",50));

        List<API> apiCourses=new ArrayList<>();
        apiCourses.add(new API("RestAssured-api-testing",100));
        apiCourses.add(new API("SoupUI-api-testing",100));

        Courses courses=new Courses(webAutomationCourses,apiCourses);

        CourseInfo courseInfo=new CourseInfo("SDET training",
                "Automation","Dolkun Tarim",
                "https://www.linkedIn.com",
                "https://seleniummaster.teachable.com/",courses);

        ObjectMapper objectMapper=new ObjectMapper();
        try {
            objectMapper.writeValue(new File("json.File/courses-info.json"),courseInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
