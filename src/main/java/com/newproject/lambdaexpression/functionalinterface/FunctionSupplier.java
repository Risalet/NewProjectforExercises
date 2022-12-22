package com.newproject.lambdaexpression.functionalinterface;

import java.util.Date;
import java.util.function.Supplier;

public class FunctionSupplier {
    public static void main(String[] args) {
        Supplier<Date> currentTime=()->new Date();
        System.out.println(currentTime.get());

        String product="Selenium java";
        String product1="java";
        Supplier<Boolean> booleanSupplier=()->product.length()==20;
        Supplier<Integer> intSupplier=()->product.length()-2;
        Supplier<String> lowerCase= product::toLowerCase;
        Supplier<String> upperCase= product::toUpperCase;
        Supplier<Integer> length=product::length;
        Supplier<Boolean> contains=()-> product.contains(product1);
        Supplier<String> replace=()->product.replaceAll(" ", "-");

        System.out.println(booleanSupplier.get());
        System.out.println(intSupplier.get());
        System.out.println(lowerCase.get());
        System.out.println(upperCase.get());
        System.out.println(length.get());
        System.out.println(contains.get());
        System.out.println(replace.get());




    }
}
