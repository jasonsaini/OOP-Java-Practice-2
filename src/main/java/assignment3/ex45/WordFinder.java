/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment3.ex45;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;

public class WordFinder {
    public static File infile
            = new File("src/main/java/assignment3/ex45/exercise45_input.txt");

    public static String promptOutFileName()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What do you want to name the output file? ");
        String outFileName = in.nextLine();
        return outFileName;
    }
    
    public static String replaceOccurrences() throws IOException {
        String conversionString = FileUtils.readFileToString(infile);
        return conversionString.replace("utilize", "use");
    }

    public static void createOutputFile(String outFileName, String replaced) throws IOException {
        File outputFile = new File("src/main/java/assignment3/ex45/"+ outFileName + ".txt");
        FileUtils.writeStringToFile(outputFile, replaced);
    }


}
