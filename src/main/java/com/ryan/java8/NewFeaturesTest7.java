package com.ryan.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Stream
 */
public class NewFeaturesTest7 {
    public static void main(String[] args) {
        // map distinct collect Collectors
        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2, 4);
        List<Integer> squaresList = numbers.stream().map(i -> i * i)
                .distinct().collect(Collectors.toList());
        System.out.println(squaresList);
        System.out.println("=================");

        // stream & parallelStream
        List<Integer> streamList = numbers.stream().collect(Collectors.toList());
        System.out.println("Stream:");
        System.out.println(streamList);

        List<Integer> psList = numbers.parallelStream().collect(Collectors.toList());
        System.out.println("ParallelStream:");
        System.out.println(psList);
        System.out.println("=================");

        // limit
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
        System.out.println("=================");

        // sorted
        random.ints().limit(10).sorted().forEach(System.out::println);
        System.out.println("=================");

        // filter
        List<String> list = Arrays.asList("efg", "", "abc", "bc", "ghij", "", "lmn");
        long count = list.stream().filter(x -> x.isEmpty()).count();
        System.out.println("count=" + count);
        List<String> str1 = list.stream().filter(x -> ! x.isEmpty()).collect(Collectors.toList());
        String str2 = list.stream().filter(x -> ! x.isEmpty()).collect(Collectors.joining(","));
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("=================");

        // statistics
        List<Integer> numbers2 = Arrays.asList(2, 3, 3, 2, 5, 2, 7);

        IntSummaryStatistics stats = numbers2.stream().mapToInt(x -> x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
    }
}
