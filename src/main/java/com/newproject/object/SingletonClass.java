package com.newproject.object;

public class SingletonClass {
    private  static SingletonClass singletonClass=null;
    String s;

    private SingletonClass() {
       s="Hello";
    }

    public static SingletonClass getInstance(){
        if (singletonClass == null){
            singletonClass=new SingletonClass();
        }
        return singletonClass;
    }

    public static void main(String[] args) {
        SingletonClass x=SingletonClass.getInstance();
        SingletonClass y=SingletonClass.getInstance();
        SingletonClass z=SingletonClass.getInstance();

        System.out.println((x.s).toLowerCase());
        System.out.println(y.s);
        System.out.println(z.s);
    }
}
