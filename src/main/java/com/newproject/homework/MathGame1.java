package com.newproject.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathGame1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("名前をアルファベトで入力して下さい: ");
        String name = scanner.nextLine();
        System.out.println("あなたの名前は : " + name);
        System.out.println("暗算何問やりますか ");
        int n=scanner.nextInt();
        System.out.println(String.format("私は %d 問　やります",n));
        System.out.println("暗算をスタートします");
        int point =0;
        for (int i=0;i<n;i++){
            int x=(int)(Math.random()*10+1);
            int y=(int)(Math.random()*10+1);
            String question=String.format("問題は :%d+%d  答え入力して下さい: ",x,y,x+y);
            System.out.println(question);
            int answer=x+y;
            int number=scanner.nextInt();
            if (answer==number) {
                point++;
                System.out.println("答えは正解です, 一点を貰えました" + point);
            } else
                System.out.println("答えは不正解です、また頑張りましよう " );
            }

        if (point >point*0.60) {
            System.out.println("暗算を勝った　、おめでとう");
        } else
            System.out.println("暗算を負けった、またやりましよう");
    }
}
