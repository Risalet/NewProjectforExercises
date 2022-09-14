package com.newproject.exercises;

import java.util.Arrays;

public class Array8 {
    public static void main(String[] args) {
        int[] array = {20, 40, 29, 89,2,4};
        int[] array1 ={30,50,40,78,5,20,};


        int n=array.length-1;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        int n1=array1.length-1;
        for (int i=0;i<n1;i++){
            for (int j=0;j<n1-i;j++){
                if (array1[j]<array1[j+1]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
