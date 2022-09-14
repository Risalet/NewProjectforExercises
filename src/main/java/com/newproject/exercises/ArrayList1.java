package com.newproject.exercises;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(29);
        a.add(67);
        a.add(87);
        a.add(90);
        a.add(84);
        System.out.println(a);
        System.out.println(a.get(0));
        a.add(5,88);
        a.add(6,0);
        System.out.println(a.remove(0));
        System.out.println(a);

        int sum=0;
        for(int i=0;i<a.size();i++){
            sum+=a.get(i);
            System.out.print(a.get(i)+" ");
        }
        System.out.println();
        System.out.println(sum);
        a.set(3,500);
        System.out.println(a);
        System.out.println(a.remove(2));
    }


}
