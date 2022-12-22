package com.newproject.lambdaexpression.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Urumqi","Kaxgar","Atush","Ghulja","shihanze");
        names.stream().filter(s->s.length()>3 && s.length()<7).forEach(System.out::println);
        //use collection
        List<String> city=names.stream().filter(s->s.length()>3 && s.length()<7).collect(Collectors.toList());
        System.out.println(city);

    }
}
