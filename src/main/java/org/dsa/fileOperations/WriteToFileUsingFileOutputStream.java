package org.dsa.fileOperations;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Arti Harde
 */
public class WriteToFileUsingFileOutputStream {

    public static void main(String[] args) {

        try {
            String text = "\nHello Arti !!!!\nWelcome to GeeksforGeeks\nHappy Learning!";
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/text3.txt");
            byte[] strToBytes = text.getBytes();
            fileOutputStream.write(strToBytes);
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}