/**
 * 
 */
package com.bhuwan.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public class ListSortingDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bhuwan");
        list.add("Suman");
        list.add("Ramesh");
        list.add("Prisha");
        list.add("Bishwas");
        list.add("Pawan");

        // you cannot add null because when comparing with null it will throw NPE.
        // list.add(null);
        System.out.println("Original List: " + list);
        Collections.reverse(list);

        System.out.println("Original natural order desc sort: ");
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("Reverse of original list: " + list);

        // default sorting, natural order
        Collections.sort(list);
        System.out.println("List after default[natural order] sorting: " + list);

        // custom sorting, reverse of natural sorting.
        Collections.sort(list, new ListCustomComparator());
        System.out.println("after using comparator: " + list);

        // will provide the reverse order comparator
        Comparator<Object> reverseOrder = Collections.reverseOrder();

        Collections.sort(list, reverseOrder);
        System.out.println("List after custom sorting[reverse of natural order]: " + list);

    }

}

class ListCustomComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }

}
