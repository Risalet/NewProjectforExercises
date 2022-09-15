package com.newproject.interview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueAndStack {
    public static void main(String[] args) {
        //FIFO
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.peek();queue.poll();

        //LIFO
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();
        System.out.println(queue+" ");
        System.out.println(stack+" ");

    }
}
