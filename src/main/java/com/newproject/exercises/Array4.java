package com.newproject.exercises;

public class Array4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};

        int i=0;
        int sum=0;
        int sum1=0;
        int sum2=0;
        do {
            sum+=arr1[i];
            sum1+=arr2[i];
            sum2=arr1[i]+arr2[i];
            System.out.print(sum2+" ");
            i++;

        }
        while(i<arr1.length);
        System.out.println();
        System.out.printf("All arrays addition %d+%d=%d ",sum,sum1,sum+sum1 );

    }
}


