package com.newproject.exceptionHandling;

public class ExceptionHandling4 {
    public static void main(String[] args) {
        String s=null;
        try {
            System.out.println(s.length());
            throw new NullPointerException("String value should be initialize");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
