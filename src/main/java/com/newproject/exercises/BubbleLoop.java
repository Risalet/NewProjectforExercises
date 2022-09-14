package com.newproject.exercises;

import java.util.Arrays;

public class BubbleLoop {
    public static void main(String[] args) {
        double[] a = {23.23, 1.23, 56.11, 78.34, 45.09, 9.98,};
        int l = a.length - 1;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - i; j++) {
                if (a[j] < a[j + 1]) {
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        double maxNumber = a[0];
        double minNumber =a[0];
        int n =a.length;
        for (int i=0; i<n; i++){
            if (a[i]>maxNumber){
            maxNumber=a[i];
            }
            else if(minNumber >a[i]){
                minNumber=a[i];
            }
        }
        System.out.println("Maxnumber is: "+ maxNumber);
        System.out.println("minnumber is:"+minNumber);
        double min=Arrays.stream(a).min().getAsDouble();
        double max=Arrays.stream(a).max().getAsDouble();

    }


}