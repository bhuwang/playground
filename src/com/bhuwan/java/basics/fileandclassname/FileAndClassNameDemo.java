/**
 * 
 */
package com.bhuwan.java.basics.fileandclassname;

/**
 * @author bhuwan
 *
 */
class FileAndClassName {

    /**
     * @param args
     */
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        System.out.println("hahahaha");
        
        // accessing overloaded methods.
        m1(3);
        m1(2.3f);
        
        // it is also possible
        m1('a');
    }

    public static void m1(int a) {
        
    }

    public static void m1(float a) {

    }
    
    public static void m1(String a) {

    }
    
    public static void m1(Object a) {

    }

}
