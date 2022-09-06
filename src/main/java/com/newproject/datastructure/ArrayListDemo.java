package com.newproject.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(23);
        list1.add(56);
        list1.add(78);
        list1.add(29);
        list1.add(34);
        System.out.println(list1);
        System.out.println(list1.get(2));
        System.out.println(list1.remove(1));
        System.out.println(list1.add(45));
        Collections.sort(list1);
        System.out.println(list1);

        int sum =0;
        for (int i=0; i<list1.size();i++){
            sum+=list1.get(i);
        }
        System.out.println(sum);

        Object[] a= list1.toArray();
        System.out.println(Arrays.toString(a));


    }
}
