package com.newproject.datatypes;

public class DataTypeConversion {
    public static void main(String[] args) {
        //Widening Casting --convert small to large
        int i1 =100;
        long l1=i1;
        System.out.printf("i1=%d l1=%d%n",i1,l1);

        int i2=200;
        double d1=i2;
        System.out.printf("i2=%d d1=%.1f\n",i2,d1);

        char c='8';
        int i3=c;
        System.out.printf(String.format("i3=%d\n",i3));

        short s1=234;
        int i4=s1;
        System.out.printf("s1=%d i4=%d%n",s1,i4 );

        //Narrowing casting
        long l2= 878678675L;
        int i5=(int)l2;
        System.out.printf("i5=%d %n",i5);

        double d2 =12.456;
        int i6=(int)d2;
        System.out.printf("i6=%d%n", i6);
    }
}
