/**
 * 
 */
package com.bhuwan.java.io.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 * Read data from two files file1.txt and file2.txt and write to file3.txt.
 * 
 * @author bhuwan
 *
 */
public class MergeDataFromTwoFilestoSingleFile {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("file3.txt"); BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
                BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));) {
            // read from file1
            String line = br.readLine();
            while (line != null) {
                pw.println(line);
                line = br.readLine();
            }

            // read from file2
            line = br2.readLine();
            while (line != null) {
                pw.println(line);
                line = br2.readLine();
            }
            pw.flush();
        } catch (Exception e) {
            System.out.println("Inside exception catch block.");
        }
    }

}
