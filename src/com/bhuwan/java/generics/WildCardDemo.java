/**
 * 
 */
package com.bhuwan.java.generics;

import java.util.ArrayList;

/**
 * @author bhuwan
 *
 */
public class WildCardDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    public void methodOne(ArrayList<?> t) {
        // this method only accepts null because we don't know the type exactly.
        // this type of methods are best suitable for read only operation not for write operation.
        // t.add(10);
        // t.add(23.10);
        t.addAll(null);
    }

    // Within the method we can't add anything to the list except null because we don't know the type exactly.
    public void methodTwo(ArrayList<? extends Double> t) {
        // t.add(10);
        // t.add(23.10);
        t.addAll(null);
    }

    // OR
    // you can only add null or Double in this case.
    public void methodThree(ArrayList<? super Double> t) {
        // t.add(10);
        t.add(23.10);
        t.addAll(null);
        // t.add("Bhuwan");
    }

}
