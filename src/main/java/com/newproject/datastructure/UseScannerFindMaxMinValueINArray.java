package com.newproject.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class UseScannerFindMaxMinValueINArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the array length");
        int lengthOfArray= input.nextInt();
        int [] arr=new int[lengthOfArray];
        int maxValue=arr[0];
        int minValue=arr[0];
        int n=arr.length;
        for(int i=0; i<n; i++){
            arr [i]=(int)(Math.random()*100+1);
            if (maxValue<arr[i]){
                maxValue=arr[i];
            }
            else  {
                minValue = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max number in array is:"+maxValue);
        System.out.println("Min number in array is"+minValue);


    }
}

