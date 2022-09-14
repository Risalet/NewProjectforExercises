package com.newproject.exercises;

public class Loop1 {
    public static void main(String[] args) {
        System.out.print("Numbers from 0 to 10 are: ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Numbers from 10 to 0 are: ");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        int evenNumber = 0;
        int oddNumber = 0;
        System.out.print("Find even numbers from 1 to 50 : ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                evenNumber++;
                System.out.print(i + " ");
            }
        }
        System.out.println();


        System.out.print("Find odd numbers from 1 to 50 : ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 1) {
                oddNumber++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("How many even number have : " + evenNumber +" \n");
        System.out.print("How many odd numbers have : " + oddNumber );

    }
}