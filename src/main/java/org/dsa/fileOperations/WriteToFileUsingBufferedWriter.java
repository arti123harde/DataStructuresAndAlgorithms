package org.dsa.fileOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Arti Harde
 */
public class WriteToFileUsingBufferedWriter {

    public static void main(String[] args) {

        String text = "Computer Science Portal GeeksforGeeks";
        try {
            BufferedWriter fWriter = new BufferedWriter(new FileWriter("src/main/resources/text2.txt"));
            fWriter.write(text);
            fWriter.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}