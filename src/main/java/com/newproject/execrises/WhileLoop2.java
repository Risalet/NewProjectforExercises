package com.newproject.execrises;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        System.out.println("Please insert some numbers ");
        int oddNumberCounts = 0;
        int evenNumberCounts = 0;
        while (true) {
            int numbers = insert.nextInt();
            if (numbers % 2 == 0||numbers!=0) {
                evenNumberCounts++;

            }
            else if (numbers % 2 == 1||numbers!=0) {
                oddNumberCounts++;
            }
            else
                break;;
        }
        System.out.println("How many even numbers have : " + evenNumberCounts);
        System.out.println("How many odd numbers have : " + oddNumberCounts);
    }
}
