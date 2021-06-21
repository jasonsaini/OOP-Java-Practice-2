/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment3.ex46;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution46 {
    public static void main(String args[]) throws IOException {
        WordFrequencyFinder finder = new WordFrequencyFinder();
        //turn file to string and then string array
        String[] words = finder.fileToArray();
        // map single string to multiple hash entries
        Map<String,Integer> wordsMap = finder.mapStringFrequencies(words);
        // Sort maps by values
        TreeMap invertedMap = finder.invertMap(wordsMap);
        // print frequencies
        finder.printWordFrequencies(invertedMap,wordsMap);
    }
}
