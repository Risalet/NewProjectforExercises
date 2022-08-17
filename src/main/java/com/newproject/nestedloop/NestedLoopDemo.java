package com.newproject.nestedloop;

import java.util.Scanner;

public class NestedLoopDemo {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("***********");
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please inter the lineNumber");
//        int lineNumber = scanner.nextInt();
//        for (int i = 1; i <= lineNumber; i++) {
//            System.out.println("**************");
//        }


        for (int r = 0; r <= 5; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("g ");
            }
            System.out.println();
        }
        for (int r1 = 0; r1 <= 5; r1++) {
            for (int c1 = 5; c1 >= r1; c1--) {
                System.out.print("g ");
            }
            System.out.println();
        }
    }
}

