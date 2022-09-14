package com.newproject.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(29);
        a.add(67);
        a.add(87);
        a.add(90);
        a.add(84);
        Iterator <Integer> iterator= a.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        Object[] array=a.toArray();
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(Arrays.toString(array));
    }
}
