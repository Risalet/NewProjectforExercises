package com.newproject.exercises;

import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
        int [] a={2,5,7,9,7,6,4,5,7,8};
        int [] b={2,5,7,9,7,6,4,5,7,8};
        boolean b1= Arrays.equals(a,b);
        System.out.println(b1);
        int arr=Arrays.binarySearch(a,9);
        System.out.println(arr);

    }
}
