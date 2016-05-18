/**
 * 
 */
package com.bhuwan.java.io;

import java.io.File;

/**
 * @author bhuwan
 *
 */
public class ListFilesInsideHomeDirectory {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String fileSeparator = System.getProperty("file.separator");
        File homeDirectory = new File(fileSeparator + "home" + fileSeparator + "bhuwan");
        System.out.println(homeDirectory.list());
        String[] list = homeDirectory.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Total Files: " + list.length);

        // display only directories
        int countDir = 0;
        for (String s : list) {
            File f1 = new File(homeDirectory, s);
            if (f1.isDirectory()) {
                countDir++;
                System.out.println(s);
            }
        }
        System.out.println("Total Directories: " + countDir);

        // display only Files
        int countFiles = 0;
        for (String s : list) {
            File f1 = new File(homeDirectory, s);
            if (f1.isFile()) {
                countFiles++;
                System.out.println(s);
            }
        }
        System.out.println("Total Files: " + countFiles);

        System.out.print("Sum of files + Dirs = total files: ");
        System.out.println((countFiles + countDir) == list.length);

        // display root Files
        File[] listRoots = File.listRoots();
        for (File root : listRoots) {
            System.out.println("Root: " + root);
        }

    }
}
