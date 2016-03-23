/**
 * 
 */
package com.bhuwan.java.jvm.references;

import java.lang.ref.SoftReference;

/**
 * @author bhuwan
 *
 */
public class SoftReferenceDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        PersonClass person = new PersonClass();
        System.out.println("original object: " + person);
        SoftReference<PersonClass> sr = new SoftReference<PersonClass>(person);

        // this will give us the strong reference
        PersonClass p1 = sr.get();
        System.out.println(p1);

        person = null;
        p1 = null;
        // again p2 is a strong referecne from weak reference.
        PersonClass p2 = sr.get();
        System.out.println(p2);

        // after this there will be no strong reference.
        p2 = null;
        System.gc();
        PersonClass p3 = sr.get();
        System.out.println(p3);

    }

}

class PersonClass {

}
