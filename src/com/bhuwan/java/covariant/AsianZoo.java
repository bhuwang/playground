/**
 * 
 */
package com.bhuwan.java.covariant;

/**
 * @author bhuwan
 */
public class AsianZoo extends Zoo {

    @Override
    Tiger getWildAnimal() {
        return new Tiger();
    }
}
