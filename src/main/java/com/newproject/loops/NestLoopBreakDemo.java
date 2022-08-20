package com.newproject.loops;

public class NestLoopBreakDemo {
    public static void main(String[] args) {
        for (int i=1;i<10; i++){
            if (i>7){
            break;
            }
            System.out.println(i);
        }
        for (int j=1;j<10; j++){
            if (j%4==0) {
                break;
            }
            System.out.println(j);
        }

        for (int i=1;;i++){
            System.out.println(i+" ");
            if(i>7);
            break;
        }

    }
}
