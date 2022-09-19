package com.newproject.homework;

import com.newproject.interview.MaxNumber;

import java.util.*;

public class ArrayListFrom1To30 {
    public static void main(String[] args) {
        Random random = new Random();
        int evenNumber = 0;
        int oddNumber = 0;
        int allNumberAddition = 0;
        int dividedBy3=0;
        int avg=0;

        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            int digitNumber = random.nextInt(100);
            number.add(digitNumber);
            allNumberAddition+=number.get(i);
            avg=allNumberAddition/number.size();
            if (number.get(i)%2==0){
                evenNumber++;
                System.out.println(number.get(i)+" Is Even Number");
            }

            if (number.get(i)%2==1){
               oddNumber++;
                System.out.println(number.get(i)+" Is Odd Number");
            }

            if(number.get(i) % 3 == 0){
                dividedBy3++;
                System.out.println(number.get(i)+" Is Divided by 3");
            }

        }
        TreeSet<Integer> numberOrder=new TreeSet<>(number);
        numberOrder.addAll(number);

        TreeSet<Integer> numberOrder1=new TreeSet<>(Collections.reverseOrder());
        numberOrder1.addAll(numberOrder);

        int maxNumber= Collections.max(number);

        int minNumber=Collections.min(number);

        System.out.println("Original List is: "+number);
        System.out.println("Ascending of the List : "+numberOrder);
        System.out.println("Descending of the List : "+numberOrder1);
        System.out.println("Addition of the List : "+allNumberAddition);
        System.out.println("Average of the List : "+avg);
        System.out.println("How many even numbers have : "+evenNumber);
        System.out.println("How many odd numbers have : "+oddNumber);
        System.out.println("How many divided by 3 numbers have : "+dividedBy3);
        System.out.println("Max Number is : "+maxNumber);
        System.out.println("Min Number is : "+minNumber);




    }
}