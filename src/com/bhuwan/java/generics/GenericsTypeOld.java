/**
 * 
 */
package com.bhuwan.java.generics;

/**
 * @author bhuwan
 */
public class GenericsTypeOld {

    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    @SuppressWarnings("unused")
    public static void main(String args[]) {
        GenericsTypeOld type = new GenericsTypeOld();
        type.set("Bhuwan Gautam");
        // type casting, error prone and can cause ClassCastException
        String name = (String)type.get();
    }

}
