package com.newproject.datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list3=new LinkedList<>();
        list3.add(24);
        list3.add(45);
        list3.add(56);
        list3.add(78);
        list3.add(567);
        list3.add(7);
        System.out.println(list3);
        list3.add(10);
        list3.add(20);
        System.out.println(list3 );
        list3.remove();
        System.out.println(list3);


        for (int i=0; i<list3.size();i++){
          System.out.print(list3.get(i)+" ");
        }

        System.out.println();

        for ( Integer value : list3){
          System.out.print(value +" ");
        }

        System.out.println();

        Iterator<Integer> iterator= list3.iterator();
         while(iterator.hasNext()){
             System.out.print(iterator.next()+" ");
         }

        Iterator <Integer> it=list3.descendingIterator();
        while (it.hasNext())
          System.out.print(it.next()+" ");

        System.out.println();

        Object[] array=list3.toArray();
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
