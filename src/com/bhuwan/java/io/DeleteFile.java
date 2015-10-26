/**
 * 
 */
package com.bhuwan.java.io;

import java.io.File;

/**
 * @author bhuwan
 */
public class DeleteFile {
    public static void main(String[] args) {
        String fileSeparator = System.getProperty("file.separator");
        // absolute file name with path
        String fileName = fileSeparator + "home" + fileSeparator + "bhuwan" + fileSeparator + "filedemo"
                + fileSeparator + "file.txt";
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println(fileName + " File deleted");
        }
        else
            System.out.println("File " + fileName + " doesn't exists");

        // file name only
        file = new File("file.txt");
        if (file.delete()) {
            System.out.println("file.txt File deleted from Project root directory");
        }
        else
            System.out.println("File file.txt doesn't exists in project root directory");

        // relative path
        String relativePath = "tmp" + fileSeparator + "file.txt";
        file = new File(relativePath);
        if (file.delete()) {
            System.out.println(relativePath + " File deleted from Project root directory");
        }
        else
            System.out.println("File " + relativePath + " doesn't exists in project root directory");

        // delete empty directory
        file = new File("tmp");
        if (file.delete()) {
            System.out.println("tmp directory deleted from Project root directory");
        }
        else
            System.out.println("tmp directory doesn't exists or not empty in project root directory");

        // try to delete directory with files
        fileName = fileSeparator + "home" + fileSeparator + "bhuwan" + fileSeparator + "filedemo";
        file = new File(fileName);
        if (file.delete()) {
            System.out.println(fileName + " deleted from " + file.getParent() + " directory");
        }
        else
            System.out.println(fileName + " doesn't exists or not empty inside " + file.getParent() + " directory");
    }
}
