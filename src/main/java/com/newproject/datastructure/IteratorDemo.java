package com.newproject.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(123);
        list.add(23);
        list.add(45);
        list.add(67);
        list.add(46);
        list.add(234);
        list.add(69);
        Iterator<Integer> iterator= list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ListIterator<Integer> list1= list.listIterator(7);
        while(list1.hasPrevious()){
            System.out.println(list1.previous());

        }
    }
}
