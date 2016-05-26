/**
 * 
 */
package com.bhuwan.java.basics.clone;

/**
 * @author bhuwan
 *
 */
public class CloneDog implements Cloneable {
    CloneCat c;
    int i;

    public CloneDog(CloneCat c, int i) {
        this.c = c;
        this.i = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
