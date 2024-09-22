package org.dsa.fileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

/**
 * @author Arti Harde
 */
public class FileReadUsingFileReader {

    public static void main(String[] args) throws Exception
    {

        FileReader fr = new FileReader("src/main/resources/demo.txt");

        File file = new File("src/main/resources/demo.txt");
        FileReader fr1 = new FileReader(file);

        FileInputStream fileInputStream = new FileInputStream(file);
        FileReader fr2 = new FileReader(fileInputStream.getFD());

        int i;
        System.out.println("File Read Using String pathname\n\n");
        while ((i = fr.read()) != -1)
            System.out.print((char)i);
        fr.close();

        System.out.println("File Read Using File Object\n\n");
        while ((i = fr1.read()) != -1)
            System.out.print((char)i);
        fr1.close();

        System.out.println("File Read Using FileDescriptor\n\n");
        while ((i = fr2.read()) != -1)
            System.out.print((char)i);
        fr2.close();

    }
}