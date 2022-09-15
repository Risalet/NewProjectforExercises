package com.newproject.exercises;

import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
       HashSet<Integer> set=new HashSet<>();
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(90);
        set.add(80);
        set.add(70);
        TreeSet<Integer> ts=new TreeSet<>(Collections.reverseOrder());
        ts.addAll(set);
        System.out.println("Sorted All elements of set "+ ts);

        System.out.println();
        ArrayList<Integer> ar=new ArrayList<>( set);
        Collections.sort(ar);
        System.out.println("Sorted list "+ ar);



        System.out.println();
        System.out.println("Sorted set use to stream : ");
        set.stream().sorted().forEach(System.out::println);

    }
}
