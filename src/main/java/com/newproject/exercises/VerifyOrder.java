package com.newproject.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class VerifyOrder {
    public static void main(String[] args) {
        List<String> phone = new ArrayList<>();
        phone.add("A");
        phone.add("B");
        phone.add("C");
        phone.add("D");
        phone.add("E");
        phone.add("F");
        System.out.println(phone+" ");

        TreeSet<String> Phone = new TreeSet<>(phone);
        ArrayList<String> Phone1=new ArrayList<>(Phone);
        boolean b=phone.equals(Phone1);
        System.out.println(b);
    }
}
