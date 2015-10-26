/**
 * 
 */
package com.bhuwan.java.generics;

/**
 * @author bhuwan
 */
public class GenericsType<T> {

    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String args[]) {
        // java 7 style declaration
        // Generic type instantiation
        GenericsType<String> type = new GenericsType<>();
        type.set("Bhuwan Gautam");
        // this will be a compile time error
        // type.set(11);

        // raw type instantiation
        GenericsType type1 = new GenericsType();
        type1.set("Prakash");
        type1.set(10);
    }

}
