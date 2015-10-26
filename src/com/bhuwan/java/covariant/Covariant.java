/**
 * 
 */
package com.bhuwan.java.covariant;

/**
 * @author bhuwan
 */
public class Covariant {

    public static void main(String[] args) {
        AsianZoo asianZoo = new AsianZoo();
        System.out.println("Asian Zoo:" + asianZoo.getWildAnimal().whoAreYou());
        AfricaZoo africaZoo = new AfricaZoo();
        System.out.println("Africa Zoo:" + africaZoo.getWildAnimal().whoAreYou());
    }
}
