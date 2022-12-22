package com.newproject.datatypes;

import java.util.Scanner;

public class ScannerDemo {
    //Scanner is Object
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please inter the first number ");
         int number1 = scanner.nextInt();
        System.out.println("Please inter the second number ");
        int number2= scanner.nextInt();
        System.out.printf("%d + %d = %d %n",number1,number2,number1+number2);
    }

}
