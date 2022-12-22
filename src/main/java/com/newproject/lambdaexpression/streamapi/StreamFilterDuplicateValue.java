package com.newproject.lambdaexpression.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilterDuplicateValue {
    public static void main(String[] args) {
        List<String> country= Arrays.asList("Australia","Canada","Australia","Brazil","America","Mexico","America");
        //The only duplicate elements
        for (int i=0;i<country.size();i++){
            for (int j=i+1;j<country.size();j++){
               // if (country.get(i)==(country.get(j))){
                if (country.get(i).equals(country.get(j))){
                    System.out.println(country.get(j));
                }
            }
        }
        //HashSet Not duplicate elements
        Set<String> countryNotDup= new HashSet<>(country);
        System.out.println(countryNotDup);

        System.out.println("@@@@@@@@@@@@@@@");

        List<Integer> numbers= Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34,34,34,2);
        //The only duplicate elements in the given stream,
        Set<Integer> result=findDupBySetAdd(numbers);
        System.out.println(" Duplicate Elements"+result);
        //result.forEach(System.out::println);

        //There are no duplicate elements in the given stream,
        List<Integer> notDupElements= numbers.stream().distinct().collect(Collectors.toList());
        //notDupElements.forEach(System.out::println);
        System.out.println(" Not Duplicate Elements"+notDupElements);
    }

    public static <T> Set<T> findDupBySetAdd(List<T> numbers){
        Set<T> notDupElements = new HashSet<>();
        return numbers.stream().filter(n->!notDupElements.add(n)).collect(Collectors.toSet());
    }
}
