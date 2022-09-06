package com.newproject.datastructure;
import java.util.Iterator;
import java.util.LinkedList;

import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
      LinkedList<Integer> list3=new LinkedList<>();
        list3.add(24);
        list3.add(45);
        list3.add(56);
        list3.add(78);
        list3.add(567);
        list3.add(7);
        list3.addFirst(89);
        list3.addLast(81);
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
        Object[] array=list3.toArray();
      for(int i=0; i<array.length; i++) {
        System.out.print(array[i] + " ");
      }
    }
}
