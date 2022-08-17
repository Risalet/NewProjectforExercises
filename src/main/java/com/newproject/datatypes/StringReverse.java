package com.newproject.datatypes;

import org.apache.commons.lang3.StringUtils;

public class StringReverse {
    public static void main(String[] args) {
        String school = "United Coder";
        String language = "java";
//
//        for (int i =language.length()-1;i>=0;i--){
//            System.out.println(language.charAt(i)+" ");
        System.out.println(StringUtils.reverse(school));
        System.out.println(StringUtils.capitalize(language));
        System.out.println(StringUtils.containsOnly("ja",language));
        System.out.println(StringUtils.reverseDelimited(school,' '));
    }
}

