/**
 * 
 */
package com.lftechnology.java.io;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * @author bhuwan
 */
public class OpenFile {
    public static void main(String[] args) throws IOException {
        String fileSeparator = System.getProperty("file.separator");
        // absolute file name with path
        String fileName = fileSeparator + "home" + fileSeparator + "bhuwan" + fileSeparator + "filedemo"
                + fileSeparator + "file.txt";
        File file = new File(fileName);

        // first check if Desktop is supported by Platform or not
        if (!Desktop.isDesktopSupported()) {
            System.out.println("Desktop is not supported");
            return;
        }

        Desktop desktop = Desktop.getDesktop();
        if (file.exists())
            desktop.open(file);

        // let's try to open PDF file
        fileName = fileSeparator + "home" + fileSeparator + "bhuwan" + fileSeparator + "filedemo" + fileSeparator
                + "file.pdf";
        file = new File(fileName);
        if (file.exists())
            desktop.open(file);
    }
}
