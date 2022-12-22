package com.newproject.datatypes;

public class StringConcatenation{
    public static void main(String[] args) {
        int a =20;
        int b =200;
        String x ="Hi";
        String y ="Java";
        String z ="50";
        System.out.println(a+b);//220
        System.out.println(a+z);//2050
        System.out.println(x+y);//Hi java
        System.out.println(a+b+x+z+x+y);//220Hi50HiJava
        System.out.println(x+y+a+b);//HiJava20200
        System.out.println(a+b+x+y+a+b);//220HiJava20200

        //String concatenation --Join two string
        String s1 ="Selenium";
        String s2 ="Master";
        System.out.println(s1+" "+s2);
        System.out.println(s1.concat(" "+s2));
        //String format
        System.out.printf("Welcome to %s %s%n", s1,s2);
        String country ="Japan";
        String city ="Osaka";
        System.out.printf("I live in %s %s%n",country,city);

        int  age =20;
        System.out.printf("My current age is %d%n",age);
        double d1 =39.245;
        double d2 =3456.5079;
        System.out.printf("%f + %f =%.4f%n",d1,d2,d1+d2);

    }

}








