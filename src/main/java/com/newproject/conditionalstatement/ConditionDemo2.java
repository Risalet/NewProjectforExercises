package com.newproject.conditionalstatement;

import java.util.Scanner;

public class ConditionDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your score");
        int score = input.nextInt();
        if (score >= 0) {
            if (score <= 100 && score >= 90)
                System.out.println("Test is passed. your score is 'A' ");

            else if (score < 90 && score >= 80)
                System.out.println("Test is passed. your score is 'B' ");

            else if (score < 80 && score >= 70)
                System.out.println("Test is passed. your score is 'B' ");

            else if (score < 70 && score >= 60)
                System.out.println("Test is passed. your score is 'C' ");

            else
                System.out.println("You test is failed ");
        }
        else
            System.out.println("Please enter the valid number.(score should be greater than zero");
    }
}




