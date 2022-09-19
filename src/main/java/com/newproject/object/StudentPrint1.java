package com.newproject.object;


import java.util.ArrayList;
import java.util.List;

public class StudentPrint1 {
    public static void main(String[] args) {
       Student student1=new Student(123456,"Takashima","Maya","Famle",23,"Rode Rode",168,68,"Maya@gmail.com","Mathematics");
       Student student2=new Student(123455,"Toyota","Ayumi","Famle",22,"Yitiba rode",83,178,"Sushi@gmail.com","Mathematic");
       List<Student> students= new ArrayList<>();
       students.add(student1);students.add(student2);
       for (Student eachStudent: students){
           System.out.println(eachStudent.toString());
      }
    }
}
