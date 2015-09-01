/**
 * 
 */
package com.lftechnology.java.io;

import java.io.File;
import java.io.IOException;

/**
 * @author bhuwan
 */
public class TempFileDemo {
    public static void main(String[] args) {
        String fileSeparator = System.getProperty("file.separator");
        try {
            File tmpFile = File.createTempFile("data", null);
            String folder = fileSeparator + "home" + fileSeparator + "bhuwan" + fileSeparator + "filedemo";
            File newFile = File.createTempFile("text", ".temp", new File(folder));
            System.out.println(tmpFile.getCanonicalPath());
            System.out.println(newFile.getCanonicalPath());
            // write,read data to tmp file like any normal file

            // delete when application terminates
            tmpFile.deleteOnExit();
            newFile.deleteOnExit();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
