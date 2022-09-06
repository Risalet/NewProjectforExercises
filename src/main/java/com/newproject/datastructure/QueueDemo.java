package com.newproject.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println(queue);
        queue.peek();
        queue.poll();
        queue.peek();
        queue.poll();
        queue.peek();
        queue.poll();
        queue.peek();
        queue.poll();
        queue.peek();
        queue.poll();
        queue.peek();
        queue.poll();
        queue.peek();
        queue.poll();
        queue.peek();
        queue.poll();
        System.out.println(queue);



        System.out.println("tssssssssssssssssssssssssssssssssssssssss");

        Stack<Integer> queue1=new Stack<>();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);
        queue1.add(6);
        queue1.pop();
        queue1.remove(1);
        System.out.println(queue1);



    }

}
