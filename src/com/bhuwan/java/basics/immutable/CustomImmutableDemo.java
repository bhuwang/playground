/**
 * 
 */
package com.bhuwan.java.basics.immutable;

/**
 * <pre>
 * Final vs Immutability:
 * 
 * 1. Final applicable for variables.
 * 2. Immutability applicable for object.
 * 
 * Immutability and Final class is different. In immutability if the content is same then the same object gets returned 
 * otherwise new object will be created and return separately.
 * </pre>
 * 
 * @author bhuwan
 *
 */
final public class CustomImmutableDemo {

    private final String name;
    private final long id;

    CustomImmutableDemo(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CustomImmutableDemo modify(long id, String name) {
        if (this.name.equals(name) && this.id == id) {
            return this;
        } else {
            return new CustomImmutableDemo(id, name);
        }
    }

    public static void main(String[] args) {
        CustomImmutableDemo i1 = new CustomImmutableDemo(1, "Bhuwan");
        CustomImmutableDemo i2 = i1.modify(1, "Prisha");
        CustomImmutableDemo i3 = i1.modify(1, "Bhuwan");
        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
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
