/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment3.ex45;

import java.io.IOException;

public class Solution45 {
    public static void main(String args[]) throws IOException {
            WordFinder finder = new WordFinder();
            //prompt for an output filename
            String outFileName = finder.promptOutFileName();
            // convert file to string
            // replace each instance of "utilize" with "use' in string
            String replaced = finder.replaceOccurrences();
            // Send string to new output file with new filename
            finder.createOutputFile(outFileName,replaced);
        }
    }
