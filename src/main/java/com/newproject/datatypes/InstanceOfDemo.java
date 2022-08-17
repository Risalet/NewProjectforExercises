package com.newproject.datatypes;

public class InstanceOfDemo {
    public static void main(String[] args) {
        Integer i =100;
        boolean b =i instanceof Integer;
        System.out.println(b);

        String s1 =new String ("Hello");
        System.out.println(s1 instanceof Object);

        System.out.println("11111111111111111111111111111111111111");

        Number n=1045789878906l;
        System.out.println(n instanceof Integer);
        System.out.println(n instanceof Short);
        System.out.println(n instanceof Byte);
        System.out.println(n instanceof Double);
        System.out.println(n instanceof Long);

        System.out.println("11111111111111111111111111111111111111");

        Number n1 =234.567;
        System.out.println(n1 instanceof Double);
    }
}
