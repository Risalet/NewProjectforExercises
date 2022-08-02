package com.newproject.datatypes;

public class DataTypeConversion2 {
    public static void main(String[] args) {
        String age="20";
        System.out.println(age+20);
        long l1=Long.parseLong(age);
        int i1 =Integer.parseInt(age);
        System.out.println(String.format("%d + %d = %d",l1+i1,l1,i1));

        String s1="200ABC";
        String s2="100.000,00";

        s1=s1.replace("ABC","");
        int i2= Integer.parseInt(s1);
        System.out.println(i2);

        s2=s2.replace(",00","").replace(".","");
        int i3=Integer.parseInt(s2);
        System.out.println(i3);

        //Convert primitive data type to String
        int i4=1000;
        float f=478.98f;
        System.out.println(i4+1000);
        String s3 =String.valueOf(i4);
        System.out.println(i4+1000);
        System.out.println(f+i4);

        String s4="12345";
        int i6=1234;
        int i5=Integer.parseInt(s4);
        System.out.println(i5);

        String s5=String.valueOf(i6);
        System.out.println(s5);
        //////////////////////////////////////////////////











    }
}
