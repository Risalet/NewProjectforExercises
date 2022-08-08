package com.newproject.conditionalstatement;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String number=scanner.next();
        if (StringUtils.isNumeric(number)) {
            int numberLength=number.length();
            switch (numberLength){
                case 1:
                    System.out.println("The number is between 10-9");
                    break;
                case 2:
                    System.out.println("The number is between 10-99");
                    break;
                case 3:
                    System.out.println("The number is between 100-99");
                    break;
                default:
                    System.out.println("The number is greater than 1000");
            }
        }
        else
            System.out.println("Please enter the valid digit numbers ");
    }
}
