package com.newproject.datastructure;

import java.util.Arrays;

public class DimensionArrayAddition {
    public static void main(String[] args) {
        int [][] a={{2,6,45,89,},{2,7,70,56,35,78,90},{23,45,89,13,345,678,},{45,11,2,6,5,8,7,908}};
        int sum=0;

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
                sum+=a[i][j];

            }
            System.out.println();

        }
        System.out.println(sum);
    }
}
