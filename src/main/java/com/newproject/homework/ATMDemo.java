package com.newproject.homework;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMDemo {
    public static void main(String[] args) {
        int pinNumber=234567;
        int balance=10000;
        Scanner input=new Scanner(System.in);
        System.out.println("Please inter your pin number");
        String password= input.nextLine();
        if (StringUtils.isNumeric(password)){
            if (pinNumber==Integer.parseInt(password)){
                System.out.println("Please select the menu(Transfer,Withdraw,Payment) ");
                String menu =input.nextLine();
                System.out.println("Please enter the withdraw amount");
                int amount = input.nextInt();

                if (menu.equalsIgnoreCase("withdraw")&& amount <=balance){
                    System.out.println("Preparing your cash, Please check you money");
                    System.out.println(String.format("Your current balance was %d, balance-amount"));
                }
                else{
                    System.out.println("Withdraw amount cant greater than balance");
                }
            }
            else
                System.out.println("Password is wrong, Please enter the valid password");
        }
        else
            System.out.println("Please enter the valid 6 digit numbers");
    }
}
