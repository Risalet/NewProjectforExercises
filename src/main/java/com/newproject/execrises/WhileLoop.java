package com.newproject.execrises;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        int oddNumber = 0;

        System.out.print("odd numbers are : ");
        while (i <= 10) {
            if (i % 2 == 1) {
                System.out.print(i+" ");
                oddNumber+=i;
            }
            i++;
        }
        System.out.println();
        System.out.print( "Addition of odd number is : "+oddNumber+" \n");

        int i1=0;
        int additionEvenNumber=0;
        System.out.print("even number are : ");
        while(i1<=10){
            i+=i;
            if (i1%2==0){
                System.out.print(i1+" ");
                additionEvenNumber+=i1;
            }
            i1++;
        }
        System.out.println();
        System.out.print("Addition of even number is : "+ additionEvenNumber);




        
                
    }
}