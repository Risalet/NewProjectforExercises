package com.newproject.exercises;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i=0;
        do {
            System.out.print(i+" ");
            i++;
        }
        while (i<=10);

        System.out.println();

        int sum=0;
        int i1=0;
        do {
            if (i1%2==0){
                sum+=i1;
                System.out.print(sum+" ");
            }
            i1++;
        }
        while(i1<=10);

    }
}
