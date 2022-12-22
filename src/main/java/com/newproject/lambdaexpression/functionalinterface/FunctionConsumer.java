package com.newproject.lambdaexpression.functionalinterface;

import java.util.function.Consumer;

public class FunctionConsumer {
    public static void main(String[] args) {
        Consumer<String> c1=s-> System.out.println(s +" is fun");
        Consumer<String> c2=s-> System.out.println(s +""+ " is not fun");
        Consumer<String> c3=s-> System.out.println(s +" is interesting");
        c1.andThen(c2).andThen(c3).accept("Java");
    }
}
