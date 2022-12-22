package com.newproject.json;

import io.restassured.path.json.JsonPath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class VerifyJsonContentMethod {

    public static int jsonAmountItem(String pathName, String pathItem) {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(pathName);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        JsonPath jsonPath = new JsonPath(inputStream);
        int amountItem = jsonPath.getInt(pathItem);
        System.out.println("Total amount item is " + amountItem);
        return amountItem;
    }


    public static int jsonItemSize(String pathName, String pathItemSize) {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(pathName);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        JsonPath jsonPath = new JsonPath(inputStream);
        int itemSize1 = jsonPath.getInt(pathItemSize);
        System.out.println("Total item size is :" + itemSize1);
        return itemSize1;
    }

    public static boolean jsonAmountItemEqualToItemSize(String pathName, String pathItem, String pathItemSize) {

        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(pathName);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        JsonPath jsonPath = new JsonPath(inputStream);

        int amountItem = jsonPath.getInt(pathItem);
        System.out.println("Total amount item is " + amountItem);

        int itemSize1 = jsonPath.getInt(pathItemSize);
        System.out.println("Total item size is :" + itemSize1);

        if (itemSize1 == amountItem) {
            System.out.println("Item responded correctly");
            return true;
        } else
            System.out.println("Item responded incorrectly");
        return false;
    }

    public static String itemTitle(String pathName, String pathItemIndex) {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(pathName);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        JsonPath jsonPath = new JsonPath(inputStream);
        String itemTitle = jsonPath.get(pathItemIndex);
        System.out.println(itemTitle);
        return itemTitle;
    }

    public static void main(String[] args) {

        VerifyJsonContentMethod.jsonAmountItem("json.File/course-info.json","dashboard.purchaseAmount");
        VerifyJsonContentMethod.jsonItemSize("json.File/course-info.json","courses.size()");
        VerifyJsonContentMethod.itemTitle("json.File/course-info.json","courses[0].title");
        VerifyJsonContentMethod.jsonAmountItemEqualToItemSize("json.File/course-info.json","dashboard.purchaseAmount","courses.size()");


    }





}
