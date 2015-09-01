/**
 * 
 */
package com.lftechnology.covariant;

/**
 * @author bhuwan
 */
public class AsianZoo extends Zoo {

    @Override
    Tiger getWildAnimal() {
        return new Tiger();
    }
}
