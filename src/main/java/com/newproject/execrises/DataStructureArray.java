package com.newproject.execrises;

import java.util.Arrays;

public class DataStructureArray {
    public static void main(String[] args) {
        //define integer array
        int[] array = new int[5];
        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;
        System.out.println(Arrays.toString(array));
        int a = array.length;
        System.out.println(a);
        int b = array[3];
        System.out.println(b);

        //加法
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            sum+=array[i];//sum+array【i】
        }
        System.out.println(sum);

        //for each
        int sum1=0;
        for (int a1: array){
            System.out.print(a1+" ");
            sum1+=a1;//sum1+a1
        }
        System.out.println(sum1);

        System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssssssss");

        int[]array1={10,20,30,40,50,60,70,80,10,10,10};
        System.out.println(Arrays.toString(array1 ));

        String[] s={"null","null","String","Java",};
        System.out.println(Arrays.toString(s));
    }
}