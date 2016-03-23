/**
 * 
 */
package com.bhuwan.java.jvm.references;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * @author bhuwan
 *
 */
public class PhantomReferenceDemo {

    /**
     * Use case: metadata
     * 
     * @param args
     */
    public static void main(String[] args) {
        PersonDemo person = new PersonDemo();
        System.out.println("original object: " + person);

        // creating a reference queue
        ReferenceQueue<PersonDemo> refQueue = new ReferenceQueue<PersonDemo>();

        PhantomReference<PersonDemo> pr = new PhantomReference<PersonDemo>(person, refQueue);

        // we cannot get the reference back from the phantom reference. This will always return null.
        PersonDemo p1 = pr.get();
        System.out.println(p1);

        // nullify strong reference
        person = null;
        Runtime.getRuntime().gc();
        
        System.out.println(pr.isEnqueued());

    }

}

class PersonDemo {

}
