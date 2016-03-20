/**
 * 
 */
package com.bhuwan.java.jvm.loading;

/**
 * @author bhuwan
 *
 */
public class ClassLoadedOnlyOneTimeDemo {

    /**
     * @param args
     */
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        Student one = new Student();
        Student two = new Student();

        Class obj1 = one.getClass();
        Class obj2 = two.getClass();
        System.out.println("obj1 hashcode: " + obj1.hashCode());
        System.out.println("obj3 hashcode: " + obj2.hashCode());
        System.out.println("obj1 and obj2 are equal: " + (obj1 == obj2));
    }

}
