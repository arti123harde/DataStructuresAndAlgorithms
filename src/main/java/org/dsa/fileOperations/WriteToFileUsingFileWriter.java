package org.dsa.fileOperations;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Arti Harde
 */
public class WriteToFileUsingFileWriter {

    public static void main(String[] args) {

        String text = "Computer Science Portal GeeksforGeeks";
        try {
            FileWriter fWriter = new FileWriter("src/main/resources/text1.txt");
            fWriter.write(text);
            fWriter.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}