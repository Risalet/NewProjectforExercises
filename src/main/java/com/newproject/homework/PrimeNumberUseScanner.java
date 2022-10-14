package com.newproject.homework;

import java.util.Scanner;

public class PrimeNumberUseScanner {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please insert digit number");
//        int number = scanner.nextInt();
        int number=40;
        for (int i = 2; i <= number; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {// i=4  10
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
            System.out.println(i + " ");
            }
        }
    }
}
 