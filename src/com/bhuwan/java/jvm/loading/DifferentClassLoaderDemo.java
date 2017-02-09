/**
 * 
 */
package com.bhuwan.java.jvm.loading;

/**
 * @author bhuwan
 *
 */
public class DifferentClassLoaderDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Bootstrap class loader
         */
        // it should return null since it is not implemented in java.
        System.out.println(Double.class.getClassLoader());

        /*
         * Ext class loader
         * 
         * This class exists in both application class path and ext class path. Since ext class path get higher priority we should get
         * ExtClassLoader instead of AppClassLoader.
         */
        // added ext_demo.jar inside the resources folder. Copy this file inside JAVA_HOME/jre/lib/ext folder.
        System.out.println(ExtClassLoaderDemo.class.getClassLoader());

        /*
         * Application class loader
         */
        System.out.println(AppClassLoaderDemo.class.getClassLoader());
    }

}
