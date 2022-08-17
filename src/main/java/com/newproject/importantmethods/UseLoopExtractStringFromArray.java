package com.newproject.importantmethods;

import java.util.ArrayList;

public class UseLoopExtractStringFromArray {
    public static void main(String[] args) {
        String sentence = "約 205,000,00045 Java 件 （0.54 秒）";
        String find = "J" ;
        ArrayList<String> findWord =new ArrayList<>();
        for (String eachString : sentence.split(" ")){
            if (eachString.contains(find)){
                findWord.add(eachString);
            }
        }
        String s1=findWord.remove(0);
        System.out.println(s1);
    }
}

