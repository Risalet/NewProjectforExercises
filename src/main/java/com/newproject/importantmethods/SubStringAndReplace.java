package com.newproject.importantmethods;

import java.util.ArrayList;

public class SubStringAndReplace {
    //SubString Another One --Return Type --Array;
    public static void main(String[] args) {
        String sentence = "約 205,000,00045 件 （0.54 秒）";
        String find = "205," ;
        ArrayList<String> findWord =new ArrayList<>();
        for (String eachString : sentence.split(" ")){
            if (eachString.contains(find)){
                findWord.add(eachString);
            }
        }
        System.out.println(findWord);
    }
}

//SubString Another One --Return Type --String;
 class Main {
     static String findWord(String sentence, String subString) {
         for (String word : sentence.split(" ")){
             if (word.contains(subString)){
                 return word;
             }
         }
         return null;
     }

     public static void main(String[] args) {
         String sentence = "約205,000,89768 件 （0.54 秒）";
         String subString = ",";
         String foundWord = findWord(sentence,subString);
         foundWord =foundWord.replace("約","").replace(",","");
         long searchNumber =Long.parseLong(foundWord);
         System.out.println(searchNumber);
         if (searchNumber>1){
             System.out.println("This test is passed");
         }else
             System.out.println("This test not passed");


     }
 }








