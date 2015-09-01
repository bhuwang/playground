/**
 * 
 */
package com.lftechnology.covariant;

/**
 * @author bhuwan
 */
public class AfricaZoo extends Zoo {

    @Override
    Lion getWildAnimal() {
        return new Lion();
    }
}
