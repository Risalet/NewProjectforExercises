package com.newproject.interview;


import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSortInArray {
    //small to big;
    public static void main(String[] args) {
        int [] arr={36,12,56,2,89,3,24};
        for(int i =0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int n=arr.length-1;
        for (int i=0;i<n; i++){
            for (int j=0;j<n-i;j++){
                if (arr[j]<arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


        int []price={23,34,45,87,43,67,78,12,25,30,50,7,28,};
        int p=price.length-1;
        for ( int i=0; i<p;i++){
            for ( int j=0; j<p-i;j++){
                if (price[j]>=price[j+1]) {
                    int temp=price[j];
                    price[j]=price[j+1];
                    price[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(price));



    }




}
