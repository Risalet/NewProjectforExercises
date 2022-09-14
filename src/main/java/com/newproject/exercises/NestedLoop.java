package com.newproject.exercises;

public class NestedLoop {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print(" % ");
            }
            System.out.println();
        }


        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.printf("%d * %d = %d\t",i,j,i*j);
            }
            System.out.println();
        }

    }
}
