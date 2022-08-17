package com.newproject.datatypes;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please inter you school name");
        String school= scanner.nextLine();
        System.out.println("Please inter you course");
        String course =scanner.nextLine();
        System.out.println(String .format("My school name and course is: %s %s ",school,course));
    }
}
