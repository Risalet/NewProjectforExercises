package com.newproject.datatypes;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;

public class StringDemo2 {
    public static void main(String[] args) {
        String school = "United Coder";
        String course = "Java Selenium Test Automation";
        System.out.println(school.concat(" " + course));
        System.out.println(school.toLowerCase());
        System.out.println(school.toUpperCase());
        System.out.println(school.charAt(0));
        System.out.println(school.length());
        System.out.println(course.toCharArray());
        System.out.println(course.substring(10));
        System.out.println(course.indexOf("a"));
        System.out.println(course.indexOf('a', course.indexOf('a') + 1));
        System.out.println(course.lastIndexOf("a"));
        System.out.println(course.indexOf("A"));
        System.out.println(school.substring(7));
        System.out.println(school.substring(4, 9));
        System.out.println(course.indexOf("Test"));
        System.out.println(course.substring(14, 18));
        System.out.println(course.replace("Java", "Python"));
        String date = "2022-8-1";
        date = date.replace("-", "/");
        System.out.println(date);
        String status = "All Test Passed ";
        System.out.println(status.indexOf("T"));
        status = status;
        System.out.println(status);


        //subString
        String java="Format and Some important functions about string";
        int functionLength="functions".length();
        int indexOff=java.indexOf("f");
        System.out.println(java.substring(indexOff,indexOff+functionLength));

        String word ="congratulations you've won this competition";
        int length = "congratulations".length();
        int length1 = "competition".length();
        int indexOfc =word.indexOf("c");
        int indexOfc1= word.lastIndexOf("c");
        System.out.println(word.substring(indexOfc,indexOfc+length));
        System.out.println(word.substring(indexOfc1,indexOfc1+length1));

        //compare to @ string
        String s1="java";
        String s2="Java";
        String s3="Java is fun";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //Contains
        boolean b1 =s3.contains(s2);
        System.out.println(b1);

        //Char At
        System.out.println(s3.charAt(5));
    }
}
