package com.newproject.loops;

public class ForEachLoops {
    public static void main(String[] args) {
        int sum=0;
//        for (int i=0; i<3; i++){
//            sum+=Integer.parseInt(args[i]);
//        }
//        System.out.println(sum);
//
        //For Each
        for (String value :args){
            System.out.println(value);
            sum+=Integer.parseInt(value);
        }
        System.out.println(sum);

    }

}
