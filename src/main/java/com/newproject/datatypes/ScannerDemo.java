package com.newproject.datatypes;

import java.util.Scanner;

public class ScannerDemo {
    //Scanner is Object
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please inter the first number ");
         int number1 = scanner.nextInt();
        System.out.println("Please inter the scond number ");
        int number2= scanner.nextInt();
        System.out.println(String.format("%d + %d = %d ",number1,number2,number1+number2));




    }

}
