package com.newproject.exercises;

import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        int[] array = {45, 2, 87, 90, 12, 46, 33, 79, 45, 67, 67, 0,};
        System.out.println(Arrays.toString(array));

        int n = array.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
