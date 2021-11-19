/**
 * 
 */
package com.bhuwan.java.basics.stringtest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * @author bhuwangautam
 *
 */
public class StringLengthVsCodePoint {

    public static void main(String[] args) {
        String weired = "Thîs lóo̰ks we̐ird!";
        System.out.println(weired.length());
        System.out.println(weired.codePoints().count());

        IntStream.of(1, 2, 4, 5).forEach(System.out::println);
        IntStream.range(0, 10).forEach(System.out::println);
        IntStream.rangeClosed(0, 10).forEach(System.out::println);
        IntStream.range(1, 8).parallel().forEach(System.out::println);
        IntStream.iterate(0, i -> i + 2).limit(4).forEach(System.out::println);
        IntStream.range(1, 5).mapToDouble(i -> i).forEach(System.out::println);

        "Bhuwan Gautam".chars().forEach(c -> System.out.println((char) c));

        System.out.println(Arrays.asList("one", "two", "three", "four").stream().max(Comparator.comparing(String::length)).get());

        String a = "vast";
        String b = "tavs";

        char[] charArray = a.toCharArray();
        char[] charArray2 = b.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray2);

        System.out.println(charArray);
        System.out.println(charArray2);

        System.out.println(Arrays.equals(charArray, charArray2));
    }
}
