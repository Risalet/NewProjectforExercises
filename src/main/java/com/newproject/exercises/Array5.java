package com.newproject.exercises;

public class Array5 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {2,6,8,4,5,9,89,33}};
        int sum=0;
        for (int i=0;i<arr1.length;i++){
            for (int j=0; j<arr1[0].length;j++){
                sum+=arr1[i][j];

            }

        }
        System.out.print("All element addition Are: "+sum);
    }
}
