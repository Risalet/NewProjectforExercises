package com.newproject.lambdaexpression.streamapi;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDupAlphabet {
    public static void main(String[] args) {
        String s = "hgkdutibm5fiskalhgueivhaljhkdoeydhg gimhn kn ; @#";
        List<String> items = Stream.of(s.split(""))
                .map(String::trim)
                .collect(Collectors.toList());

        //  print original List to console
        System.out.println("Original List With duplicate :\n " + items);

        //   get duplicate count using Map
        Map<String, Integer> duplicateCountMap = items.stream()
                .collect(Collectors.toMap(Function.identity(),
                        company -> 1, Math::addExact));

        //  print Map for duplicate count
        System.out.println("\n2. Map with Key and its duplicate count : \n");
        duplicateCountMap.forEach((key, value) ->
                System.out.println( key + "-" + value));
        }
    }

