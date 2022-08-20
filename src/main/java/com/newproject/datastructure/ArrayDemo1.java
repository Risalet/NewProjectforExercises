package com.newproject.datastructure;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] array1= new int[5];
        array1[0]=200;
        array1[1]=300;
        array1[2]=400;
        array1[3]=500;
        array1[4]=600;

        for (int i=0; i<= array1.length-1;i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        for (int a :array1){
            System.out.print(a+" ");

        }

        System.out.println("----------------------------------------");
        int[] array = new int[]{8,20,21,3,5};
        //总和；
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println(sum);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println();

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenSum = evenSum + array[i];
            }
            else {
                oddSum = oddSum + array[i];
            }
        }

        System.out.println(evenSum);

        System.out.println(oddSum);

        System.out.println("&&&&&&&&&&&&&&&&&&&");
    }
}
