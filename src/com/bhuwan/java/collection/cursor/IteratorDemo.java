/**
 * 
 */
package com.bhuwan.java.collection.cursor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator is also known as a Universal cursor. It is available for every {@link Collection} Objects.
 * 
 * It also has remove method.
 * 
 * @author bhuwan
 *
 */
public class IteratorDemo {

    private IteratorDemo() {

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        System.out.println("Initial List: " + list);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            if (num % 2 == 0) {
                System.out.println(num);
            } else {
                it.remove();
            }
        }
        System.out.println("After Operation - List: " + list);
    }

}
