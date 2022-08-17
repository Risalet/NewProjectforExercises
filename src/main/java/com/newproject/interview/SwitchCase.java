package com.newproject.interview;

import org.apache.commons.lang3.StringUtils;

public class SwitchCase {
    public static void main(String[] args) {
        int number =1234;
        int digitCounts= String.valueOf(number).length();
        switch (digitCounts){
            case 1:
                System.out.println("This number is less than 9");
                break;
            case 2:
                System.out.println("This number is between 10 and 99 ");
                break;
            case 3:
                System.out.println("This number is between 100 and 999 ");
                break;
            case 4:
                System.out.println("This number is between 1000 and 9999 ");
                break;
            default:
                System.out.println("THis is a number");

        }

    }

}
