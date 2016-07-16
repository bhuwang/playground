/**
 * 
 */
package com.bhuwan.java.generics;

import java.util.ArrayList;

/**
 * @author bhuwan
 *
 */
public class ErasureDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    public static void One(ArrayList<String> s) {

    }

    // following method won't compile
    // public static void One(ArrayList<Integer> s) {
    // }

    public <T extends Happy> T foo(T emotion) {
        // do something
        return null;
    }

    public <T extends Sad> T foo(T emotion) {
        return null;
        // do something else
    }

}

class Happy {

}

class Sad {

}
