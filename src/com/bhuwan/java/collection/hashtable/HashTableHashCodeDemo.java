/**
 * 
 */
package com.bhuwan.java.collection.hashtable;

import java.util.Hashtable;

/**
 * This class demonstrate the HashTable hash code implementation and how it maintains the sorting order by hash code.
 * 
 * The default initial capacity of HashTable is 11.
 * 
 * HashTable is thread safe.
 * 
 * null key or value not allowed.
 * 
 * First the HashTable with 11 buckets from 0 to 10 will be created. We know that the first hash code is 5 so it will be inserted into the
 * bucket 5 as 5=A, then in bucket 2 2=B, then in bucket 6 6=C.
 * 
 * For the case of 15 since there is no bucket with 15 then 15%11[initial capacity]=4 and in 4 15=D will be placed.
 * 
 * The Bucket is read from top to bottom and right to left if it contains more than two entry inside the same bucket.
 * 
 * @author bhuwan
 *
 */
public class HashTableHashCodeDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Hashtable<Temp, String> table = new Hashtable<>();
        table.put(new Temp(5), "A");
        table.put(new Temp(2), "B");
        table.put(new Temp(6), "C");
        table.put(new Temp(15), "D");
        table.put(new Temp(23), "E");
        table.put(new Temp(16), "F");

        System.out.println(table);
    }

}

class Temp {
    int i;

    public Temp() {
    }

    public Temp(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public String toString() {
        return i + "";
    }
}