/**
 * 
 */
package com.bhuwan.java.io.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bhuwan
 *
 */
public class FileReaderDemo {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("----------------------------------------------");
        System.out.println("Reading file using read() method.");
        System.out.println("----------------------------------------------");
        FileReader fr = new FileReader("file_writer_demo.txt");
        int read = fr.read();
        while (read != -1) {
            System.out.print((char) read);
            read = fr.read();
        }

        // reading file using read(ch) method
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("Reading file using read(ch) method.");
        System.out.println("----------------------------------------------");
        File file = new File("file_writer_demo.txt");
        char[] chars = new char[(int) file.length()];
        FileReader fileReader = new FileReader(file);
        fileReader.read(chars);
        for (char c : chars) {
            System.out.print(c);
        }
        fileReader.close();
        fr.close();
    }

}
