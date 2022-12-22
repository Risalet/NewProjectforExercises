package com.newproject.lambdaexpression.streamapi;

import com.newproject.exercises.Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSingleFilter {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<Integer> odd = nums.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
        List<Integer> even = nums.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(odd);
        System.out.println(even);

        List<Integer> numbers=Arrays.asList(23,56,1,89,56,11,54,20,89,45,36,45,77,89,23,2,6,7,8,0);
        List<Integer> oddNumbers= numbers.stream().filter(number -> number%2!=0).collect(Collectors.toList());
        List<Integer> evenNumbers= numbers.stream().filter(number ->number%2==0).collect(Collectors.toList());
        int oddNumberLength=oddNumbers.size();
        int evenNumberLength=evenNumbers.size();
        System.out.println("How many odd numbers have : " + oddNumberLength + "; There are : " + oddNumbers);
        System.out.println("How many even numbers have : " + evenNumberLength + "; There are : " + evenNumbers);

    }
}
