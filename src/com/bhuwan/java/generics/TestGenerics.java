/**
 * 
 */
package com.bhuwan.java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public class TestGenerics {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add("Bhuwan");
        list.add(12.22);
        list.add(123.1f);

        Double name = (Double) list.get(1);

        System.out.println(list);
        System.out.println(name);

        List<Integer> cities = new ArrayList<>();
        cities.add(1232);

        CustomGenerics<Integer> numbers = new CustomGenerics<>();
        numbers.setT(1223);
    }

}

class CustomGenerics<T extends Number> {

    private T t;

    /**
     * @return the t
     */
    public T getT() {
        return t;
    }

    /**
     * @param t
     *            the t to set
     */
    public void setT(T t) {
        this.t = t;
    }

}
