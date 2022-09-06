package com.newproject.datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(40);
        set.add(70);
        set.add(56);
        set.add(60);
        System.out.println(set);

        Set<Integer> set1 = new HashSet<>();
        set1.add(30);
        set1.add(40);
        set1.add(70);
        set1.add(56);
        set1.add(60);
        set1.add(null);
        set1.add(null);
        System.out.println(set1);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(70);
        set2.add(56);
        set2.add(60);
        set2.add(null);
        set2.add(null);
        System.out.println(set2);

        Object[] array = set.toArray();
        Object[] array1 = set1.toArray();
        Object[] array2 = set2.toArray();
        for ( Object value : array) {
            System.out.print(value+" ");
        }
        for ( Object value1 : array1) {
            System.out.print(value1+" ");
        }
        for (Object value2 : array2) {
            System.out.print(value2+" ");
        }
    }
}