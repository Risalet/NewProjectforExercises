package com.newproject.datatypes;

import java.util.Random;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-134));//
        System.out.println(Math.negateExact(20));
        System.out.println();

        System.out.println(Math.max(-45,23));
        System.out.println(Math.min(45,12));
        System.out.println();

        System.out.println(Math.addExact(4,5));//+
        System.out.println(Math.subtractExact(10,4));//-
        System.out.println(Math.multiplyExact(2,7));//multiplication 乘法
        System.out.println(Math.floorDiv(10,10));//division 除法
        System.out.println();

        System.out.println(Math.incrementExact(6));//i++
        System.out.println(Math.decrementExact(5));//i--
        System.out.println();

        System.out.println(Math.sqrt(64));//√64²
        System.out.println(Math.pow(2,4));
        System.out.println();

        System.out.println(Math.random());//Random number from 0.0 to 0.9999999
        int randomNumber=(int)(Math.random()*11);//random number from 0 to 10
        System.out.println(randomNumber);
        int number=(int)(Math.random()*11)+1;//random number from 1 to 11
        System.out.println(number);

        Random random =new Random();
        int numbers = 1000000000 +(int)(random.nextDouble() * 999999999 );
        System.out.println(numbers);
    }
}
