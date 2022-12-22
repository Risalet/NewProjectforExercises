package com.newproject.json;

import io.restassured.path.json.JsonPath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class VerifyJsonCourseContent {

    public void courseContent(String pathName, String pathItemSize, String pathItem, String pathItemIndex) {


        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(pathName);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        JsonPath jsonPath = new JsonPath(inputStream);
        int amountItem = jsonPath.getInt(pathItem);
        System.out.println("Total amount courses are " + amountItem);

        int itemSize1 = jsonPath.getInt(pathItemSize);
        System.out.println("Total item size is :" + itemSize1);

        if (itemSize1 == amountItem) {
            System.out.println("Item responded correctly");
        }

        String firstItemTitle = jsonPath.get(pathItemIndex);
        System.out.println(firstItemTitle);
    }

  public static void main(String[] args) {
      VerifyJsonCourseContent verifyJsonCourseContent=new VerifyJsonCourseContent();
      verifyJsonCourseContent.courseContent("json.File/course-info.json","courses.size()","dashboard.purchaseAmount","courses[0].title");


  }
}
