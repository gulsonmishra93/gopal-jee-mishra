package com.practice.demo.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemoMain {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Geeks", "For"),
                Arrays.asList("GeeksForGeeks", "A computer portal"),
                Arrays.asList("Java", "Programming")
        );

        listOfLists.stream().flatMap(list -> list.stream()).forEach(System.out::println);

        List<String> list = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");

        list.stream().flatMap(str -> Stream.of(str.charAt(2))).forEach(System.out::println);

    }
}
