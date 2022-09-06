package com.newproject.execrises;

public class Array {
    public static void main(String[] args) {
        int[] value = new int[]{3, 5, 7, 8, 9,10};
        int oddNumber=0;
        int evenNumber=0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] % 2 == 1) {
                System.out.println(value[i] + " ");
                oddNumber++;

            }
            else if(value[i] % 2 == 0){
                System.out.println(value[i]+" ");
                evenNumber++;

            }


        }

        System.out.println("Number of odd numbers : " + oddNumber);
        System.out.println("Number of even number : "+evenNumber);

    }
}