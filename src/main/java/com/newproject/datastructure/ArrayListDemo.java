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
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.set(1,5);
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);

        List<Integer> list=list1.subList(0,4);
        System.out.println(list+" ");


       Collections.sort(list1);
        System.out.println(list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);




//        int sum =0;
//        for (int i=0; i<list1.size();i++){
//            sum+=list1.get(i);
//        }
//        System.out.println(sum);
//
//        Object[] a= list1.toArray();
//        System.out.println(Arrays.toString(a));


    }
}
