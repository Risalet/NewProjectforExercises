package com.newproject.exercises;

public class Loop3 {
    public static void main(String[] args) {
        System.out.println("Numbers From 1 to 100 are : ");
        for (int i=1; i<=100; i++){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Number from 100 to 0 are: ");
        for (int i=100; i>=0; i--){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("Even number of From 1 to 100 are : ");
        int sum=0;
        for (int i=1; i<=100; i++){
            if (i%2==0){
                System.out.println(i+" ");
                sum=sum+i;
            }
        }
    }
}
