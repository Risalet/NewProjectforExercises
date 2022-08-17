package com.newproject.interview;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        //10,20,30
        Scanner input = new Scanner(System.in);
        int number1= input.nextInt();
        int number2= input.nextInt();
        int number3= input.nextInt();

        if (number1>number2&&number1>number3){
            System.out.printf("%d is biggest number", number1);
        }
        else if (number2>number3){
            System.out.printf("%d is biggest number" ,number2);
        }
        else
            System.out.printf("%d is biggest number" ,number3);
    }
}
