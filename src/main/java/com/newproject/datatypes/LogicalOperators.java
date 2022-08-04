package com.newproject.datatypes;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean b1=true;
        boolean b2=false;
        boolean b3=true;

        System.out.println(b1&&b2);// and and
        System.out.println( b1||b2);//or or
        System.out.println(b1&&b3);//and and
        System.out.println(!(b1&&b3));//not

        int number1=50;
        int number2=100;
        boolean result1 =(number1==number2)&&(number1==20);//false
        boolean result2 =(number1!=number2)&&(number2!=20);//true
        boolean result3 =(number1==5)||(number2==100);//true
        boolean result4 =(!(number1==50)&&(number2==100));//false

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }




}
