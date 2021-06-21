/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment3.ex41;

import java.io.IOException;
import java.util.ArrayList;

public class Solution41 {
    public static void main(String args[]) throws IOException {
        NameSorter sorter = new NameSorter();
        // sort names from file
        ArrayList<String> names = sorter.sortNamesFromFile("src/main/java/assignment3/ex41/exercise41_input.txt");
        // print output
        sorter.writeToOutputFile("src/main/java/assignment3/ex41/exercise41_output.txt");
    }

}
