/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment3.ex46;

import com.sun.source.tree.Tree;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordFrequencyFinder
{
    public static File mainFile = new File("src/main/java/assignment3/ex46/exercise46_input.txt");
    public static File testFile1 = new File("src/test/java/assignment3/ex46/input1.txt");
    public static File testFile2 = new File("src/test/java/assignment3/ex46/input2.txt");
    public static File testFile3 = new File("src/test/java/assignment3/ex46/input3.txt");

    public static String[] fileToArray() throws IOException {
        String  fileString = FileUtils.readFileToString(testFile3);
        fileString = fileString.replace("\n", " ").trim().replace("\r", "");
        return fileString.split(" ");
    }

    public static Map<String, Integer> mapStringFrequencies(String[] words) {
        Map<String,Integer> map  = new HashMap<>();
        for(String word : words)
        {
            Integer num = map.get(word);
            if(num == null)
            {
                num = 1;
            }
            else
            {
                ++num;
            }
            map.put(word,num);
        }
        return map;
    }

    public static TreeMap<Integer, String> invertMap(Map<String, Integer> unSortedMap)
    {
        TreeMap<Integer, String> invertedMap = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0; i < unSortedMap.keySet().size(); i++)
        {
            String originalKey = unSortedMap.keySet().toArray()[i].toString();
            Integer originalInt = unSortedMap.get(originalKey);
            invertedMap.put(originalInt, originalKey);
        }
        return invertedMap;
    }


    public static void printWordFrequencies(TreeMap<Integer,String> invertedMap, Map<String,Integer> originalMap)
    {
        for(int i = 0; i < invertedMap.keySet().size(); i++)
        {
            String originalKey = invertedMap.get(invertedMap.keySet().toArray()[i]);
            System.out.print(originalKey + ": ");
            int currentFreq = originalMap.get(originalKey);
            for(int j = 0; j < currentFreq; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }







}
