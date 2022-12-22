package com.newproject.exceptionHandling;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
              e.getMessage();
            e.printStackTrace();
            System.out.println("This catch is block");
        }
        System.out.println("World");
    }
}
