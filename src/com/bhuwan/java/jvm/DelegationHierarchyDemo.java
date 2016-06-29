/**
 * 
 */
package com.bhuwan.java.jvm;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author bhuwan
 *
 */
public class DelegationHierarchyDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        do {
            System.out.println(classLoader);
            for (URL url : classLoader.getURLs()) {
                System.out.println(url.getPath());
            }
        } while ((classLoader = (URLClassLoader) classLoader.getParent()) != null);
        System.out.println("Bootstrap Class Loader Reached.");
    }

}
