package com.newproject.interview;

public class OverloadingAndOverriding {
    //Overloading --Same method name, different method signature(Parameters or argument),
    // same or different body/implementation  in the same class;<Static Polymorphism>
    //Overriding --Same method name, same method signature,
    // different body/implementation  in subclass(Child and parents);<Dynamic polymorphism>
    //Inheritance  super keyword    extends keyword

    //overloading
    //public void sameName(different signature (parameters)){
    // different or same implementation(body); }

    public void add(int a,int b){

        System.out.println(a+b);
    }

    public void add(int a,int b,int c){
        System.out.println(a+b);
        //or
        System.out.println((a+b)+c);
    }


}
