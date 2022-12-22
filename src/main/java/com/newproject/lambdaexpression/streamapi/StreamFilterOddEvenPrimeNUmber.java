package com.newproject.lambdaexpression.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import static java.lang.System.out;


public class StreamFilterOddEvenPrimeNUmber {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,56,11,54,20,36,45,77,89,23,2,6,7,8,0);
        out.println("There are even numbers : ");
        numbers.stream().filter(s->s%2==0).forEach(out::println);
        out.println("There are odd numbers : ");
        numbers.stream().filter(s->s%2!=0).forEach(out::println);

        //Prime number
        out.println("There are prime numbers : ");
        Predicate<Integer> greaterThan1= s->s>1;
        Predicate<Integer> isPrimeNumber= StreamFilterOddEvenPrimeNUmber::isPrimeNo;
       numbers.stream().filter(greaterThan1).filter(isPrimeNumber).forEach(out::println);
    }

    private static boolean isPrimeNo(Integer number){
        IntPredicate doseNotModGetReminderAsZero=rangeNumber->(number% rangeNumber!=0);
        return IntStream.range(2,number/2).allMatch(doseNotModGetReminderAsZero);
    }
}
