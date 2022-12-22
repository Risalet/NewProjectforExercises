package com.newproject.datastructure;

import java.util.*;

public class FindDuplicateElement {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Grape");
        fruits.add("Watermelon");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Peach");
        fruits.add("Strawberry");
        fruits.add("Fig");
        fruits.add("Blueberry");
        fruits.add("Apricot");
        fruits.add("Cherry");
        fruits.add("Cherry");
        Set<String> fruits1=new HashSet<>();
        for (int i=0; i<fruits.size(); i++){
            String fruitsName=fruits.get(i);
            if (!fruits1.add(fruitsName)){
                System.out.println("Duplicate Fruits is " +  fruitsName+" ");
            }
        }
        System.out.print(fruits1 + " ");
    }

}
