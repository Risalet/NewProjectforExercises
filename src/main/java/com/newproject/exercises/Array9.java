package com.newproject.exercises;

public class Array9 {
    public static void main(String[] args) {
        int[] array = {20, 40, 29, 89,2,4};
        int[] array1 ={30,50,40,78,5,20,};
        int[] array2 ={36,98,78,38,12,45};
        int n=array.length;
        int sum=0;
        int sum1=0;
        int sum2=0;
        int newArray=0;
        for (int i=0;i<n;i++){
            sum+=array[i];
            sum1+=array1[i];
            sum2+=array2[i];
            newArray=sum+sum1+sum2;
            System.out.print(newArray+" ");
        }
        System.out.println(newArray+" ");
        System.out.printf("All arrays addition %d+%d=%d ",newArray,sum,sum1,sum2 ,sum+sum1+sum2 );
    }
}
