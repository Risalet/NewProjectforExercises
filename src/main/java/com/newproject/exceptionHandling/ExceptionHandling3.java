package com.newproject.exceptionHandling;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        try {
            int [] arr ={2,3,4,5};
            System.out.println(arr[5]);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Hello");
        }

    }

}
