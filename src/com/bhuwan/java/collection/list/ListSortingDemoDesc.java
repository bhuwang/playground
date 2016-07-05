package com.bhuwan.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ListSortingDemoDesc {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bhuwan");
        list.add("Suman");
        list.add("Ramesh");
        list.add("Prisha");
        list.add("Bishwas");
        list.add("Pabhan");
        list.add("Pratibha");

        System.out.println("original: " + list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("Original natural order desc sort: " + list);
        list.parallelStream().filter(s -> s.contains("bh")).forEach(System.out::println);

        Stream<Integer> stream = Stream.of(1, 3, 5, 6, 13, 12, 4, 8);
        System.out.println(stream.filter(number -> number % 2 != 0).mapToInt(i -> i).sum());
    }

}
