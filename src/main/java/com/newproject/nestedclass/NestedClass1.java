package com.newproject.nestedclass;

public class NestedClass1 {
    private void print(){
        System.out.println("This is a root class(outer class)");
    }
    class InnerClassA{
        private int sum(int a, int b){
            System.out.printf("%d + %d= %d%n",a,b,a+b);
            return a+b;
        }
    }

    static class InnerClassB{
        private long multiply(int a, int b){
            System.out.printf("%d * %d= %d%n",a,b,a*b);
            return (long) a *b;
        }

        public static void main(String[] args) {
            NestedClass1 nestedClass1=new NestedClass1();
            nestedClass1.print();
            NestedClass1.InnerClassA innerClassA=new NestedClass1().new InnerClassA();
            innerClassA.sum(12,12);
            InnerClassB innerClassB=new InnerClassB();
            innerClassB.multiply(2,2);

        }

    }
}
