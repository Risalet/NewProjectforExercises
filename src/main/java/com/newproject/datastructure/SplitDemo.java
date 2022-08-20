package com.newproject.datastructure;
import java.util.Arrays;
import java.util.Scanner;

public class SplitDemo {
    public static void main(String[] args) {
        String s = "United-Coder-school";
        String s1 = "Hello,World";
        String[] arr = s.split("-");
        for (String value : arr) {
            System.out.print(value + " ");
        }
        String[] arr1 = s1.split(",");
        System.out.print(arr1[0]);



    }

}
