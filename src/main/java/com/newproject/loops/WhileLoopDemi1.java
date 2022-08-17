package com.newproject.loops;

import java.util.Scanner;

public class WhileLoopDemi1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please insert number");
        int positiveNumberCounts=0;
        int negativeNumberCounts=0;
        while (true){
            int numbers=scanner.nextInt();
            if (numbers>0){
                positiveNumberCounts++;
            }
            else if(numbers<0){
                negativeNumberCounts++;
            }
            else
                break;
        }
        System.out.println("Negative number counts :"+negativeNumberCounts);
        System.out.println("PositiveN number counts :"+ positiveNumberCounts);

    }

}
