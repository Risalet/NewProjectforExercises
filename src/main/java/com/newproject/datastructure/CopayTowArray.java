package com.newproject.datastructure;

import java.util.Arrays;

public class CopayTowArray {
    public static void main(String[] args) {
        int [] a={20,45,56,78,34};
        int [] b= Arrays.copyOf(a,5);
        System.out.println(Arrays.toString(b));

        int [] arr={105,230,100,4400,300};
        int [] arr1=new int[arr.length];
        System.arraycopy(arr, 0, arr1, 0, arr.length);
        System.out.println(Arrays.toString(arr1));
    }
}
