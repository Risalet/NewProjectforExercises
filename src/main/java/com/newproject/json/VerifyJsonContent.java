package com.newproject.json;

import io.restassured.path.json.JsonPath;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class VerifyJsonContent {
    public static void main(String[] args) {
        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream("json.File/course-info.json");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        JsonPath jsonPath=new JsonPath(inputStream);
        int courseSize= jsonPath.getInt("courses.size()");
        System.out.println("Total course size is : "+courseSize);
        if (courseSize==3){
            System.out.println("Course responded correctly");

            int amount= jsonPath.getInt("dashboard.purchaseAmount");
            System.out.println("Total amount courses are "+amount);

            String firstCourseTitle=jsonPath.get("courses[0].title");
            System.out.println(firstCourseTitle);

            int sum=0;
            for (int i=0;i<courseSize;i++){
                int price=jsonPath.getInt("courses["+i+"].price");
                int copies= jsonPath.getInt("courses["+i+"].copies");
                int amount1=price*copies;
                sum+=amount1;
            }
            System.out.println(sum);
            if (sum==amount)
                System.out.println("Correct purchase amount calculation");
            else System.out.println("Incorrect purchase amount ");
        }

    }
}
