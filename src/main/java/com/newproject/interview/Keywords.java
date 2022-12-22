package com.newproject.interview;

public class Keywords extends parentClass{
    protected void finalize(){
    }

    //Final Keywords--final variable, method, class
    //Finally--Try--Catch
    // public void finalize(){}

    // this keywords --represent object (class)
    //  static--belongs to class itself--className., if not static--use new keywords,
    //  private--Encapsulation-- parameter is private, method is public to accesses


    public static void main(String[] args) {
        int x = 100;
        int y = 120;
        System.out.println(x);
        x = 130;
        System.out.println(x);
        // Never change value If you use final keywords ;
        int a = 200;
        final int b = 300;
        System.out.println(b);
    }

    //overriding sum class
    public void sum(int a, int b) {
        System.out.println(a * b);
    }
}


    //Never extends final class;
    class parentClass {
        String firstName;
        String lastName;

        public void sum(int a,int b){
            System.out.println(a+b);
        }

        public parentClass() {
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

    // this keywords --represent object (class)
   //  static--belongs to class itself--className., if not static--use new keywords,
   //  private--Encapsulation-- parameter is private, method is public to accesses


