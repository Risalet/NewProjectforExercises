package com.newproject.exercises;

public class Array10 {
    public static void main(String[] args) {
        int[] array = {20, 40, 29, 89,2,4};
        int[] array1 ={30,50,40,78,5,20,};
        int[] array2 ={36,98,78,38,12,45};
        int n=array.length;
        int sum=0;
        int sum1=0;
        int sum2=0;
        int newArray=0;
        int i=0;
        do {
            sum+=array[i];
            sum1+=array1[i];
            sum2+=array2[i];
            newArray=array[i]+array1[i]+array2[i];
            System.out.print(newArray+" ");
            i++;
        }
        while (i<n);
        System.out.println();
        System.out.printf("All arrays addition %d+%d+%d=%d ",newArray,sum,sum1,sum2 ,sum+sum1+sum2 );
    }
}
