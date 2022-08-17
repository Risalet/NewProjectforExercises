package com.newproject.conditionalstatement;

import java.util.Scanner;

public class ConditionDemo1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter the first number");
        int x= input.nextInt();
        System.out.println("Please enter the second number ");
        int y= input.nextInt();
        int z=x+y;
        System.out.printf("Please enter the calculation result of %d and %d \n", x,y);
        int result= input.nextInt();
        if (result==z){
            System.out.println("Good job!!!");
        }else{
            System.out.println("OOPS!!!Wrong calculation, Please try again");
        }
    }
}
