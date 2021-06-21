/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment3.ex46;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyFinderTest {
    String expectedOutput1 = "jason: *\n";
    String expectedOutput2 = "jason: *****\n";
    String expectedOutput3 = "word: ************************************";

    public static void testOutputToFile(TreeMap<Integer,String> invertedMap, Map<String,Integer> originalMap, File output) throws IOException {
        String outputString = "";
        for(int i = 0; i < invertedMap.keySet().size(); i++)
        {
            String originalKey = invertedMap.get(invertedMap.keySet().toArray()[i]);
            outputString = originalKey + ": ";
            int currentFreq = originalMap.get(originalKey);
            for(int j = 0; j < currentFreq; j++)
            {
               outputString += "*";
            }
            outputString += "\n";
        }
        FileUtils.writeStringToFile(output,outputString);


    }

    // Remember to set input file in WordFrequencyFinder class!!!
    @Test
    void outputMatches_set1() throws IOException {
        File output1 = new File("src/test/java/assignment3/ex46/output1.txt");
        WordFrequencyFinder finder = new WordFrequencyFinder();
        String[] words = finder.fileToArray();
        Map<String,Integer> wordsMap = finder.mapStringFrequencies(words);
        TreeMap invertedMap = finder.invertMap(wordsMap);
        testOutputToFile(invertedMap,wordsMap, output1);
        String expected = expectedOutput1;
        String actual = FileUtils.readFileToString(output1);
        assertEquals(expected,actual);
    }

    // Remember to set input file in WordFrequencyFinder class!!!
    @Test
    void outputMatches_set2() throws IOException {
        File output2 = new File("src/test/java/assignment3/ex46/output2.txt");
        WordFrequencyFinder finder = new WordFrequencyFinder();
        String[] words = finder.fileToArray();
        Map<String,Integer> wordsMap = finder.mapStringFrequencies(words);
        TreeMap invertedMap = finder.invertMap(wordsMap);
        testOutputToFile(invertedMap,wordsMap, output2);
        String expected = expectedOutput2;
        String actual = FileUtils.readFileToString(output2);
        assertEquals(expected,actual);
    }

    // Remember to set input file in WordFrequencyFinder class!!!
    @Test
    void outputMatches_set3() throws IOException {
        File output3 = new File("src/test/java/assignment3/ex46/output3.txt");
        WordFrequencyFinder finder = new WordFrequencyFinder();
        String[] words = finder.fileToArray();
        Map<String,Integer> wordsMap = finder.mapStringFrequencies(words);
        TreeMap invertedMap = finder.invertMap(wordsMap);
        testOutputToFile(invertedMap,wordsMap, output3);
        String expected = expectedOutput3;
        String actual = FileUtils.readFileToString(output3);
        assertEquals(expected,actual);
    }




}