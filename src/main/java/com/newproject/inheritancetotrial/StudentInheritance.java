package com.newproject.inheritancetotrial;

public class StudentInheritance extends Student{
    private String major;
    private String email;


    public StudentInheritance(String firstName, String lastName, int id, String major, String email) {
        super(firstName, lastName, id);
        this.major = major;
        this.email = email;
    }


    @Override
    public String toString() {
        return String.format("First Name: %s Last Name: %s ID: %d Major: %s E-mail: %s ",getFirstName(),getLastName(),getId(),major,email);
    }
}


