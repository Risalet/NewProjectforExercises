package com.newproject.miniproject;

import java.util.*;

public class MathGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Inter Your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is : " + name);
       List<String> questions=new ArrayList<>();
        questions.add("X=10  Y=20, What is X+Y");  int answer0=30;
        questions.add("X=10  Y=30, What is X+Y "); int answer1=40;
        questions.add("X=10  Y=40, What is X+Y "); int answer2=50;
        int point=0;
        int i=0;
            for (String question: questions){
                System.out.println("Question :" +question);
                System.out.println("Type your answer ");
                int number=scanner.nextInt();
                if (questions.indexOf(question)==0 && number==answer0) {
                    point++;
                    System.out.println("You guessed the answer right, point=  " + point);
                }

                else if (questions.indexOf(question) ==1 && number==answer1) {
                    point++;
                    System.out.println("You guessed the answer right, point=  " + point);

                }
                else if (questions.indexOf(question) ==2 && number==answer2) {
                    point++;
                    System.out.println("You guessed the answer right, point=  " + point);
                }
                else
                    System.out.println("You guessed wrong, Please inter the valid answer point= " + point);
            }

        if (point >= 2) {
            System.out.println("You win the math game");
        } else
            System.out.println("You loose the math game");
    }
}
