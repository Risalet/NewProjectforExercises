package com.newproject.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class InterfaceComparableRun {
    public static void main(String[] args) {
        ArrayList<InterfaceComparable> student=new ArrayList<>();
        student.add(new InterfaceComparable(" Kasim","3",89));
        student.add(new InterfaceComparable(" Aasim","5",90));
        student.add(new InterfaceComparable(" Masim","7",69));
        student.add(new InterfaceComparable(" Tasim","9",98));
        student.add(new InterfaceComparable(" Jasim","21",100));
        student.add(new InterfaceComparable(" Masim","11",57));
        student.add(new InterfaceComparable(" Yasim","8",81));
//        System.out.println(student);
//
//        student.sort(Comparator.comparing(InterfaceComparable::getStudentName));
//        System.out.println(student);
//        student.sort(Comparator.comparing(InterfaceComparable::getStudentName).reversed());
//        System.out.println(student);

        System.out.println("@@@@@@@@@@@@@@@@");
        Collections.sort(student);
        System.out.println(student);
    }
}
