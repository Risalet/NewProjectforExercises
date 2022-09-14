package com.newproject.exercises;

import java.util.Stack;

public class StackList {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(80);
        s.push(50);
        s.push(60);
        s.push(null);
        s.push(null);
        s.push(100);
        System.out.println(s);
        System.out.println("1111111111111111");
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println("22222222222222222");
        System.out.println(s);
        System.out.println(s.search(80));
        System.out.println(s.search(30));
        s.remove(0);
        System.out.println(s);
        s.set(0,10);
        s.set(1,10);
        System.out.println(s);





    }
}
