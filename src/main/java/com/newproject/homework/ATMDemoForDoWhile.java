package com.newproject.homework;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMDemoForDoWhile {
    public static void main(String[] args) {
        int pinNumber=234567;
        int balance=10000;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your pin number");
        int chance=3;
        int i=0;
        do{
            i++;
            String password=input.nextLine();
            if(StringUtils.isNumeric(password)&&pinNumber==Integer.parseInt(password)){
                System.out.println("Please enter withdraw amount....");
                int money=input.nextInt();
                if(money<balance){
                    System.out.println("Please take the cash: "+money);
                    System.out.println("Your balance was: "+(balance-money));
                }
                else {
                    System.out.println("You don't have enough money");
                }
                break;
            }
            else {
                System.out.println("Your pin number in incorrect(or invalid) please try again");
                System.out.printf("This is %d times you are trying, you only can try %d time%n",i,chance-i);
            }
        }while (i<chance);

    }
}