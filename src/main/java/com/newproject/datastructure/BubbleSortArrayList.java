package com.newproject.datastructure;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>
                (Arrays.asList(2, 8, 7,78,23,87,3,1,6));
        numbers.add(45);
        numbers.set(2,56);

        int n=numbers.size()-1;
        for (int i=0; i<n; i++){
            for (int j=0;j<n-i;j++){
                if ( numbers.get(j) > numbers.get(j+1) ){
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j+1));
                    numbers.set(j + 1, temp);
                }
            }
        }
        System.out.println(numbers);
    }
}
