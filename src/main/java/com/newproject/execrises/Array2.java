package com.newproject.execrises;

import java.util.Arrays;


public class Array2 {
    public static void main(String[] args) {
        int[] arrayNums = {5, 7, 2, 4, 9};
        System.out.println("Original Array: " + Arrays.toString(arrayNums));
        int evenNumber = 0;
        for (int i = 0; i < arrayNums.length; i++) {
            if (arrayNums[i] % 2 == 0) {
                System.out.println("Even number : "+arrayNums[i] + " ");
                evenNumber++;

            }
            else
                System.out.println("Odd number : "+arrayNums[i]+ " ");
        }
        System.out.println("Number of even numbers : " + evenNumber);
        System.out.println("Number of odd numbers  : " + (arrayNums.length - evenNumber));
    }
}

