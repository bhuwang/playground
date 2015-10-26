/**
 * 
 */
package com.bhuwan.java.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * @author bhuwan
 */
public class AutomaticResourceManagement {
    private static final Logger LOGGER = Logger.getLogger(AutomaticResourceManagement.class.getName());

    /**
     * @param args
     */
    public static void main(String[] args) {

        String fileSeparator = System.getProperty("file.separator");
        // absolute file name with path
        String fileName = fileSeparator + "home" + fileSeparator + "bhuwan" + fileSeparator + "filedemo"
                + fileSeparator + "file.txt";

        // Before Java 7
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File(fileName)));
            LOGGER.info("Using Java 6 - line: " + reader.readLine());
        }
        catch (IOException e) {
            LOGGER.info("Using Java 6 - Exception while reading file: " + fileName);
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                }
                catch (IOException e) {
                    LOGGER.info("Using Java 6 - Exception while closing the opened resources");
                }
            }
        }

        // After Java 7
        try (BufferedReader reader1 = new BufferedReader(new FileReader(new File(fileName)));) {
            LOGGER.info("Using Java 7 - line: " + reader1.readLine());
        }
        catch (IOException e) {
            LOGGER.info("Using Java 7 - Exception while reading file: " + fileName);
        }
    }

}
