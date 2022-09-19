package com.newproject.object;

import java.util.ArrayList;

public class StudentPrint {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setId(12345);
        student1.setFirstName("Takahashi");
        student1.setLastName("Maya");
        student1.setEmail("hgjhj@gmail.com");
        student1.setAddress("Rose rode");
        student1.setMajor("Methmetics");
        student1.setAge(43);
        student1.setWeight(67);
        student1.setGender("Famle");
        student1.setHeight(179);
        ArrayList <Student> students=new ArrayList<>();
        students.add(student1);
        for (Student eachStudent: students){
            System.out.println(String.format("StudentId : %d  First Name : %s  Last Name : %s  E-male : %s  Address : %s  Major : %s  Age : %d  Weight : %d  Gender : %s  Height : %d",
                    eachStudent.getId(),eachStudent.getFirstName(),eachStudent.getLastName(),
                    eachStudent.getEmail(),eachStudent.getAddress(),eachStudent.getMajor(),
                    eachStudent.getAge(),eachStudent.getWeight(),eachStudent.getGender(),
                    eachStudent.getHeight()));
        }
    }
}
