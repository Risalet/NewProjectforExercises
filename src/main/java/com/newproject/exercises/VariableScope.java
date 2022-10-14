package com.newproject.exercises;

public class VariableScope {
    int year=2021;

    public void car(){
        int price=2000;
        String color="red";
    }

    public void car(String color,int price){
        System.out.println(price);
        System.out.println(year);
    }

    public static void main(String[] args) {
        VariableScope variableScope=new VariableScope();
//        variableScope.year
    }
}
