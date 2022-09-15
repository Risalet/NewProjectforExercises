package com.newproject.exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FIndDuplicateElement {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);
        numbers.add(80);
        numbers.add(90);
        System.out.print(numbers+" ");
        HashSet<Integer> numbers1=new HashSet<>();
        for (int i=0;i<numbers.size();i++){
            int number=numbers.get(i);
            if (numbers1.add(number)==false){
                System.out.println("Number is duplicated " +number);
            }
        }
        numbers1.addAll(numbers);
        System.out.print(numbers1+" ");
        }
    }
