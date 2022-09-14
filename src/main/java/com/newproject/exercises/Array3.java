package com.newproject.exercises;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] num={40,60,45,90,65,85,95,100,89,79,60};
        System.out.println("Original Array: " + Arrays.toString(num));
        int oddNumber=0;
        int evenNumber=0;
        int sum=0;
        int sum1=0;
        int i=0;
        while (i<num.length){
            if (num[i]%2==0){
                System.out.println("Even Number are: "+num[i]+" ");
                evenNumber++;
                sum+=num[i];

            }
            else if (num[i]%2==1){
                System.out.println("Odd Number Are :"+num[i]+" ");
                oddNumber++;
                sum1+=num[i];
            }
            i++;
        }
        System.out.println("How many odd number have "+oddNumber);
        System.out.println("How many even number have "+ evenNumber);
        System.out.println("How many odd number addition :"+sum1);
        System.out.println("How many even number addition :"+sum);


    }


}
