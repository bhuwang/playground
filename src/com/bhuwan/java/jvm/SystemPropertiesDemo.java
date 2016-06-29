/**
 * 
 */
package com.bhuwan.java.jvm;

import java.util.Properties;

/**
 * @author bhuwan
 *
 */
public class SystemPropertiesDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.list(System.out);
    }

}
