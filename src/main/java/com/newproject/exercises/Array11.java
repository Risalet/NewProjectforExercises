package com.newproject.exercises;

public class Array11 {
    public static void main(String[] args) {
        int[] array = {20, 40, 29, 89,2,4};
        int maxNumber=0;
        int minNumber=0;
        int n=array.length-1;
        for (int i=0;i<n;i++) {
            if (array[i] > array[i + 1]) {
                maxNumber = array[i];
            } else if (array[i] < array[i + 1]) {
                minNumber = array[i];
            }
        }
        System.out.println(maxNumber);
        System.out.println(minNumber);
    }
}
