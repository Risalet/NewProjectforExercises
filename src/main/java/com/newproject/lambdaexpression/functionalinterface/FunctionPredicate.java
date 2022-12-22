package com.newproject.lambdaexpression.functionalinterface;

import java.util.function.Predicate;

public class FunctionPredicate {
    public static void main(String[] args) {
        //greater than 50
        Predicate<Integer> predicate=f->(f>18);
        System.out.println(predicate.test(2));

        Predicate<String> p1=s->(s.length()>5);
        System.out.println(p1.test("Selenium"));

        int a []={20,40,10,30,100,8,3,5};
        int evenSum=0;
        int oddSum=0;
        for (int array:a){
            if (array%2==0) {
                evenSum=evenSum+1;
            }
            else
                oddSum=oddSum+1;

        }
        System.out.println(evenSum);
        System.out.println(oddSum);

        //Stream

        Predicate<Integer> p2=p->(p%2==0);
        for (int arr:a){
            if (p2.test(arr)){
                System.out.println(arr);
            }
        }

        for (int arr:a){
            if (p2.negate().test(arr)){
                System.out.println(arr);
            }
        }
    }
}
