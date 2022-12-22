package com.newproject.lambdaexpression.functionalinterface;

import java.util.function.Function;

public class FunctionFunctional {
    public static void main(String[] args) {
        Function<Integer,Integer> f1= f->(f*f);
        System.out.println(f1.apply(10));

        Function<String,Integer> f2=f->(f.length());
        System.out.println(f2.apply("Java"));

        Function<Integer, Integer> f3= f->(f*10);
        System.out.println(f3.apply(2));
        System.out.println(f3.andThen(f1).apply(5)); //2500
        System.out.println(f3.compose(f1).apply(5));//250
    }
}
