package org.dsa.fileOperations;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

/**
 * @author Arti Harde
 */
public class ReadFileAsListOfLines {

    public static void main(String[] args)
    {
        try {
            List list = Files.readAllLines(Paths.get("src/main/resources/demo.txt"), StandardCharsets.UTF_8);
            Iterator<String> itr = list.iterator();
            while (itr.hasNext())
                System.out.println(itr.next());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}