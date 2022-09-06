package com.newproject.datastructure;

import java.util.*;

public class AllColecction {
    public static void main(String[] args) {
        List<String> city = Arrays.asList("null","null","1Tokyo","Kyoto","Nagasaki","Fukushima","Hiroshima");
        List<String> city2 =new LinkedList<>(Arrays.asList("null","null","2Tokyo","Kyoto","Nagasaki","Fukushima","Hiroshima"));
        Set<String> city3=new HashSet<>(Arrays.asList("null","null","3Tokyo","Kyoto","Nagasaki","Fukushima","Hiroshima"));
        Set<String> city4=new LinkedHashSet<>(Arrays.asList("null","null","4Tokyo","Kyoto","Nagasaki","Fukushima","Hiroshima"));
        Set<String> city5=new TreeSet<>(Arrays.asList("null","null","5Tokyo","Kyoto","Nagasaki","Fukushima","Hiroshima"));
        Queue<String> city6=new LinkedList<>(Arrays.asList("null","null","6Tokyo","Kyoto","Nagasaki","Fukushima","Hiroshima"));
        Stack<String> city7 = new Stack<>();
        city7.add("null");
        city7.add("null");
        city7.add("7Tokyo");
        city7.add("Kyoto");
        city7.add("Nagasaki");
        city7.add("Fukushima");
        city7.add("Hiroshima");

        city.forEach(System.out::println);
        System.out.println();

        city2.forEach(System.out::println);
        System.out.println();

        city3.forEach(System.out::println);
        System.out.println();

        city4.forEach(System.out::println);
        System.out.println();

        city5.forEach(System.out::println);
        System.out.println();

        city6.forEach(System.out::println);
        System.out.println();

        city7.forEach(System.out::println);
        System.out.println();


    }
}
