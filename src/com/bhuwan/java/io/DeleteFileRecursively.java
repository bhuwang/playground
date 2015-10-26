/**
 * 
 */
package com.bhuwan.java.io;

import java.io.File;

/**
 * @author bhuwan
 */
public class DeleteFileRecursively {

    public static void main(String[] args) {
        String fileSeparator = System.getProperty("file.separator");
        String folder = fileSeparator + "home" + fileSeparator + "bhuwan" + fileSeparator + "filedemo";
        // delete folder recursively
        recursiveDelete(new File(folder));
    }

    public static void recursiveDelete(File file) {
        // to end the recursive loop
        if (!file.exists())
            return;

        // if directory, go inside and call recursively
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                // call recursively
                recursiveDelete(f);
            }
        }
        // call delete to delete files and empty directory
        file.delete();
        System.out.println("Deleted file/folder: " + file.getAbsolutePath());
    }
}
