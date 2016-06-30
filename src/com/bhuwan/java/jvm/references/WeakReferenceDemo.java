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
        // again p2 is a strong reference from weak reference.
        Person p2 = wr.get();
        System.out.println(p2);

        // once the gc runs on weak ref, then there will be no strong reference.
        p2 = null;
        System.gc();
        Person p3 = wr.get();
        System.out.println(p3);

    }

}

class Person {

}
