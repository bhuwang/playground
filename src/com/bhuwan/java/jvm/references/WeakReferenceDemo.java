/**
 * 
 */
package com.bhuwan.java.jvm.references;

import java.lang.ref.WeakReference;

/**
 * @author bhuwan
 *
 */
public class WeakReferenceDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("original object: " + person);
        WeakReference<Person> wr = new WeakReference<Person>(person);

        // this will give us the strong reference
        Person p1 = wr.get();
        System.out.println(p1);

        person = null;
        p1 = null;
        Person p2 = wr.get();
        System.out.println(p2);

        p2 = null;
        System.gc();
        Person p3 = wr.get();
        System.out.println(p3);

    }

}

class Person {

}
