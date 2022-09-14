package com.newproject.exercises;

import java.util.*;

public class Arraylist4 {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(29);
        a.add(67);
        a.add(87);
        a.add(90);
        a.add(84);
       if (a.contains(67)){
           System.out.println("THis test is ok");
       }
        Iterator<Integer> iterator= a.iterator();
       while (iterator.hasNext()){
           System.out.print(iterator.next()+" ");
       }
        Collections.sort(a);
        System.out.print(a+" ");
        Collections.sort(a,Collections.reverseOrder());
        System.out.print(a+" ");

        Object [] b=a.toArray();
        System.out.print(Arrays.toString(b));


    }
}
