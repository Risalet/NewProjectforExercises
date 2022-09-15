package com.newproject.exercises;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class Set1 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
        set.add(80);
        set.add(90);
        System.out.print(set+" ");
        System.out.println();

        Object[] array = set.toArray();
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        Iterator <Integer> it= set.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();






    }
}
