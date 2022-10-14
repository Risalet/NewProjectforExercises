package com.newproject.object;

public class Family {
    private String name;
    private String age;
    private String school;
    private String email;

    public Family() {
    }

    public Family(String name, String age, String school, String email) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.email = email;
    }



    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", school='" + school + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
