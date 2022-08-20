package com.newproject.datastructure;

import java.util.Arrays;

public class FindMinAndMaxValueInArray {
    public static void main(String[] args) {
        //Max value in array;
        int [] arr={36,12,56,2,89,3,24};
        int maxValue=0;
        int l=arr.length;
        for (int i=0; i<l; i++){
            if (maxValue<arr[i]){
                maxValue=arr[i];
            }
        }
        System.out.println(maxValue);

        //Min value in array;
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(min);
        System.out.println(max);
    }



}
