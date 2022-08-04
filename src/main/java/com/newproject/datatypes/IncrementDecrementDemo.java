package com.newproject.datatypes;

public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int a=10;
        int b=5+(a++);
        int c=a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println();

        int a1=10;
        int b1=5+(++a1);
        int c1=++a1;

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);

        System.out.println("*******************************************");
        int i=1;
        int j=i++;
        System.out.println(i);
        System.out.println(j);

        System.out.println();

        int m=1;
        int n=++m;
        System.out.println(m);
        System.out.println(n);

    }
}

