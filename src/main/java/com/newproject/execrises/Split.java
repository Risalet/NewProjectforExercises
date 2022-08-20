package com.newproject.execrises;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String s1="you go to school, ";
        String[]arr=s1.split(" ");
        System.out.println(Arrays.toString(arr));
       String a=arr[3];
        System.out.println(a);
        String b=a.replace(",","");
        System.out.println(b);
    }

}
