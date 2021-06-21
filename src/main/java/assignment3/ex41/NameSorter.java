/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment3.ex41;

import java.io.*;
import java.util.ArrayList;
import java.io.File;
import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;


public class NameSorter {
    public static ArrayList<String> names = new ArrayList<>();

    public static ArrayList<String> sortNamesFromFile(String filename) throws IOException {

            // Initialize file object and scanner
            File file = new File(filename);
            Scanner scanner = new Scanner(new FileReader(filename));

            // Scan all lines (names) in file
            while(scanner.hasNextLine())
            {
                names.add(scanner.nextLine());
            }

            // Sort them lexographically
            Collections.sort(names,String.CASE_INSENSITIVE_ORDER);
        // Return sorted list
        return names;
    }

    public static void writeToOutputFile(String outFileName) throws IOException {
        // Initialize file writer object
        FileWriter writer = new FileWriter(outFileName);

        // Print top line
        writer.write( "Total of " + names.size() + " names\n");
        writer.write("---------------\n");

        // Print each name from sorted list
        for(int i = 0; i < names.size(); i++)
        {
            writer.write(names.get(i));
            writer.write("\n");
        }

        // Close output file
        writer.close();
    }






}
