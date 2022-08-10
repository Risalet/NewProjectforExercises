package com.newproject.conditionalstatement;

public class Practice {
    public static void main(String[] args) {
        //Different between & && operator
       boolean  b1 = true;
        int number = 100;
        if (b1 && (number++ > 0)) {
            System.out.println("True statement");
        } else {
            System.out.println("False statement");
        }
        System.out.println("Value of number:" + number);

        int number1 = 100;
        if (b1 & (number1++) > 0) {
            System.out.println("True statement");
        } else {
            System.out.println("False statement");
        }
        System.out.println("Value of number:" + number1);

        int number2=100;
        if ((number2++) > 0 & b1) {
            System.out.println("True statement");
        } else {
            System.out.println("False statement");
        }
        System.out.println("Value of number:" + number1);

        int number3=100;
        if ((number++ > 0)&& b1 ) {
            System.out.println("True statement");
        } else {
            System.out.println("False statement");
        }
        System.out.println("Value of number:" + number);
    }

}
