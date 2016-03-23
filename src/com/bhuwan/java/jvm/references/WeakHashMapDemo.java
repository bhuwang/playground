/**
 * 
 */
package com.bhuwan.java.jvm.references;

import java.util.Date;
import java.util.WeakHashMap;

/**
 * @author bhuwan
 *
 */
public class WeakHashMapDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // create weak has map
        WeakHashMap<PersonOne, PersonMetaData> weakHashMap = new WeakHashMap<>();
        PersonOne bhuwan = new PersonOne();
        weakHashMap.put(bhuwan, new PersonMetaData());

        // get person data by person object and you will get strong reference.
        // PersonMetaData p1 = weakHashMap.get(bhuwan);
        // System.out.println(p1);

        // make strong reference available for gc
        bhuwan = null;

        // run garbage collector
        // Runtime.getRuntime().gc();

        // check if the value exists and display the result.
        System.out.println(weakHashMap.size());
    }
}

class PersonMetaData {
    Date date;

    public PersonMetaData() {
        date = new Date();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PersonMetaData [date=" + date + "]";
    }
}

final class PersonOne {

}
