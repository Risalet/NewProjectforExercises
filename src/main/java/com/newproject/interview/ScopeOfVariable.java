package com.newproject.interview;

public class ScopeOfVariable {
    //class level, variable, global variable, instance variable
    int a = 200;
    String b = "200";

    public void dum(int a, int b) {//local variable
        int c=100;
        int j=130;
        System.out.println(a+b);
        System.out.println(c);

    }
}