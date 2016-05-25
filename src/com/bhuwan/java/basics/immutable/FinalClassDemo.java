/**
 * 
 */
package com.bhuwan.java.basics.immutable;

/**
 * <pre>
 * 1. Declare the class as final so it can’t be extended.
 * 2. Make all fields private so that direct access is not allowed.
 * 3. Don’t provide setter methods for variables
 * 4. Make all mutable fields final so that it’s value can be assigned only once.
 * </pre>
 * 
 * @author bhuwan
 *
 */
final public class FinalClassDemo {

    private final String name;
    private final long id;

    public FinalClassDemo(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

}
