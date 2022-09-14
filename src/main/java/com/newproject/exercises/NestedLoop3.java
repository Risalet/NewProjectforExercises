package com.newproject.exercises;

public class NestedLoop3  {
    public static void main(String[] args) {
        int n=9;
        for (int i=1;i<=n;i++){
            for (int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for (int s=1; s<=n-i;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
