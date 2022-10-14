package com.newproject.homework;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please insert row number ");
        int row= scanner.nextInt();
//        int row=3;
        for (int r=1;r<=row;r++){
            for (int c=1;c<=Math.pow(2,r);c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

