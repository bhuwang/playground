/**
 * 
 */
package com.bhuwan.java.io;

import java.io.File;
import java.io.IOException;

/**
 * @author bhuwan
 */
public class CreateNewFile {

    public static void main(String[] args) throws IOException {
        String fileSeparator = System.getProperty("file.separator");
        // absolute file name with path
        String absoluteFilePath = fileSeparator + "tmp" + fileSeparator + "file.txt";
        File file = new File(absoluteFilePath);
        if (file.createNewFile()) {
            System.out.println(absoluteFilePath + " File Created");
        } else {
            System.out.println("File " + absoluteFilePath + " already exists");
        }

        // file name only
        file = new File("file.txt");
        if (file.createNewFile()) {
            System.out.println("file.txt File Created in Project root directory");
        } else {
            System.out.println("File file.txt already exists in project root directory");
        }

        // relative path
        String relativePath = fileSeparator + "tmp" + fileSeparator + "file.txt";
        file = new File(relativePath);
        if (file.createNewFile()) {
            System.out.println(relativePath + " File Created in Project root tmp directory");
        } else {
            System.out.println("File " + relativePath + " already exists in project root tmp directory");
        }

        // create directory
        file = new File(fileSeparator + "tmp", "test_directory");
        if (file.mkdir()) {
            System.out.println("Directory named " + file + " created successfully.");
        } else {
            System.out.println("Directory already exist: " + file);
        }
    }

}
