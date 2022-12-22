package com.newproject.lambdaexpression.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamCompare {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(5, 13, 4, 21, 13, 27,59,59,34,2);
        Optional<Integer> maxvalue=numbers.stream().max(Integer::compareTo);
        System.out.println(maxvalue.get());

        Optional<Integer> minvalue=numbers.stream().min(Integer::compareTo);
        System.out.println(minvalue.get());

        List<Integer> sortStoB= numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortStoB);

       numbers.stream().sorted( Comparator.reverseOrder()).forEach(System.out::println);







    }

}
