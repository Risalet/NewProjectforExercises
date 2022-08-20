package com.newproject.datastructure;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] value=new int[]{20,30,40,50,60};
        System.out.println(value.length);

        System.out.println(Arrays.stream(value).max()); 
        System.out.println("---------------------------");

        for (int i=0;i<value.length ;i++){
            System.out.print(value[i]+" ");
        }
        System.out.println();
        for (int a: value){
            System.out.print(a+" ");
        }
        System.out.println();

        int[] prices ={23,45,67,89,};
        int price =1;
        for (int i=1; i<prices.length; i++ ){
            price*=prices[i];
        }
        System.out.print(price);

        int sum1=0;
        for (int p:prices){
            System.out.print(p +" ");
            sum1+=p;
        }
        System.out.println(sum1+" ");
        System.out.println(Arrays.toString(value ));





    }

}