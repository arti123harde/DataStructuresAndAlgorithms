package org.dsa.fileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Arti Harde
 */
public class FileReadUsingScanner {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/demo.txt");
        Scanner sc = new Scanner(file);

        System.out.println("Without Loop.....\n\n");
        // we just need to use \\Z as delimiter
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());

        System.out.println("\n\nWith Loop.....\n\n");
        sc = new Scanner(file);
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());

    }
}
