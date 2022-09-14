package com.newproject.exercises;

public class Array12 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4,5,6}, {7,8,9,10,11,12}, {13,14,15,16,17,18}};
        int n = a.length;
        int sum = 0;
        int maxNumber = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
                sum += a[i][j];
            }
        }
        System.out.println(sum);

        for (int i = 0; i < n; i++) {
            for (int j = i; j < a[i].length; j++) {

                if (maxNumber<a[i][j]){
                    maxNumber=a[i][j];
                }
            }
        }
        System.out.println(maxNumber);

    }
}