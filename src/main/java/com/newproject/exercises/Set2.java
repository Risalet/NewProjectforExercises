package com.newproject.exercises;

import java.util.*;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(90);
        set.add(80);
        set.add(70);
        Set<Integer> treeSet=new TreeSet<>();
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(50);
        treeSet.add(60);
        treeSet.add(90);
        treeSet.add(80);
        treeSet.add(70);
        Set<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(30);
        linkedHashSet.add(20);
        linkedHashSet.add(40);
        linkedHashSet.add(50);
        linkedHashSet.add(60);
        linkedHashSet.add(90);
        linkedHashSet.add(80);
        linkedHashSet.add(70);
        System.out.print(linkedHashSet+" ");
        System.out.print(treeSet+" ");
        System.out.print(linkedHashSet+" ");

    }
}