package com.newproject.datatypes;

public class DataType {
    public static void main(String[] args) {
        byte b1 = 120;
        int i1= 140;
        System.out.println(b1-i1);

        byte b2 = 127;
        short s1= 2000;
        System.out.println(b2+s1);

        int age = 27;
        int addition = b1+b2+s1;
        System.out.println("My age is :" +age);
        System.out.println("Addition of b1 ,b2 and s1 :"+ addition);

        long depositMoney= 3986473836483683L;
        System.out.println(depositMoney);

        //decimal digits-- Float, double ;
        float f1 = 789.234f;
        System.out.println(f1);
        double d1 = 6789.6794664;
        System.out.println(d1);

        double x =10;
        double y =3;
        double z=x/y;
        System.out.println(z);

        //Boolean-- true false
        boolean result = true;
        boolean status = false;
        System.out.println("\"Successful message display -Test Result is passed\" " + result);
        System.out.println(" /Successful message not display - Test Result is / " + status);
        System.out.println(10>7);
        boolean comparison = 4<10;
        System.out.println(comparison);

        //Char
        char c1 = 'A';
        char c2 = 'B';
        int a = c1;
        int b = c2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c1+c2);
    }
}
