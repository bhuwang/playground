/**
 * 
 */
package com.bhuwan.java.basics.staticdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bhuwan
 */
public final class StaticDemo {
    static {
        System.out.println("I am the first");
        m1();
    }

    public static void m1() {
        System.out.println("I am inside m1 method.");
        List<String> name = new ArrayList<>();
        name.add("Bhuwan");
        name.add("Sanjaya");
        name.add("Naresh");
        name.add("Madhav");
        name.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {

        StaticExample one = new StaticExample();

        StaticExample two = new StaticExample();

        System.out.println("I am the first third");
        StaticExample.setCount(5);

        // non-private static variables can be accessed with class name
        StaticExample.str = "abc";
        StaticExample se = new StaticExample();
        System.out.println(se.getCount());
        // class and instance static variables are same
        System.out.println(StaticExample.str + " is same as " + se.str);
        System.out.println(StaticExample.str == se.str);

        // static nested classes are like normal top-level classes
        StaticExample.MyStaticClass myStaticClass = new StaticExample.MyStaticClass();
        myStaticClass.count = 10;

        StaticExample.MyStaticClass myStaticClass1 = new StaticExample.MyStaticClass();
        myStaticClass1.count = 20;

        System.out.println(myStaticClass.count);
        System.out.println(myStaticClass1.count);
    }

    static {
        System.out.println("I am the second");
    }

}
