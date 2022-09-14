package com.newproject.exercises;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(11);
        a.add(20);
        a.add(91);
        a.add(84);
        a.add(500);
        System.out.println( a.size());
        System.out.println(a);

        int sum=0;
        int evenNumber=0;
        int oddNumber=0;
        int n=a.size();
        for (int i=0; i<n;i++){
            sum+=a.get(i);
            if ( a.get(i) %2==0){
             evenNumber++;
                System.out.println("Even NUmber in list are : "+ a.get(i)+" ");
            }
            else if( a.get(i) %2==1){
                oddNumber++;
                System.out.println("Odd number in list are : "+ a.get(i)+" ");
            }
        }
        System.out.println("All list addition : "+ sum);
        System.out.println(oddNumber);
        System.out.println(evenNumber);

    }

}
