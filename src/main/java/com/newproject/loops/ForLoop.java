package com.newproject.loops;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("88888888888888888888888");

        for (int i=1; i<=100; i++ ){
            if (i%12==0){
                System.out.println(i);
            }
        }
    }
}