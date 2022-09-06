package com.newproject.datastructure;

import java.util.*;
import java.util.stream.Collectors;

public class VeryOrder {
    public static void main(String[] args) {
        List<String> phone=new ArrayList<>();
        phone.add("Iphone");
        phone.add("Nokia");
        phone.add("LG");
        phone.add("Panasonic");
        phone.add("Samsung");
        phone.add("Sony");
        phone.add("Motorola");
        phone.add("Oppo");
//       phone.forEach(System.out::println);
        Collections.sort(phone);
        System.out.println(phone);
        Collections.reverse(phone);
        System.out.println(phone);


        System.out.println("Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwee");


       List<String> list=new ArrayList<>();
       list.addAll(phone);
       Collections.sort(list);
       list.forEach(System.out::println);
       boolean isSorted =list.equals(phone);
       if (isSorted)
           System.out.println("phone list is ascending order");//small to big
       else
           System.out.println("phone list in in descending order"); //Big to small

        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());

        sortedList.forEach(System.out::println);





    }
}
