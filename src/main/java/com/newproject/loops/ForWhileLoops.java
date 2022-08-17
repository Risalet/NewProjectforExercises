package com.newproject.loops;

public class ForWhileLoops {
    public static void main(String[] args) {
        int i=1;
        while (i<=100){
            if (i%2!=0){
                System.out.println(i);
            }
            i++;
        }

        int i1=1;
        int sum =0;
        while(i1<10){
            if (i1%2!=0){
                System.out.println(i1);
                sum+=i1;
            }
            i1++;
        }
        System.out.println(sum);
    }
}
