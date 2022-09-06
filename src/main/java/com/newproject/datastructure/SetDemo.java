package com.newproject.datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(100);
        set1.add(200);
        set1.add(300);
        set1.add(400);
        set1.add(500);
        set1.add(600);
        set1.add(null);
        set1.add(null);
        System.out.print(set1 + " ");
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(600);
        list.add(600);
        list.add(null);
        list.add(null);
        System.out.print(list + " ");
        System.out.println(list.get(1));

        System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqq");

        Object[] array= set1.toArray();
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ravi");
        list1.add("Vijay");
        list1.add("Ajay");

        HashSet<String> set = new HashSet(list1);
        set.add("Gaurav");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(list1+" ");
    }
}
