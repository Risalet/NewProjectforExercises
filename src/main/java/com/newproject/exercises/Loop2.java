package com.newproject.exercises;

public class Loop2 {
    public static void main(String[] args) {

        int evenNumber = 0;
        int additionEvenNumber=0;
        System.out.print("Even number are: ");
        for (int i = 0; i <= 10; i++) {
            if (i%2==0){
                additionEvenNumber+=i;
                evenNumber++;
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        System.out.print("Addition of Even number is : "+additionEvenNumber+" \n");
        System.out.println("How many even numbers have :"+evenNumber);
    }
}