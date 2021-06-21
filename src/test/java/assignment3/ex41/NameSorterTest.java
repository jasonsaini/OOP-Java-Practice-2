/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment3.ex41;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

    @Test
    void names_are_sorted_set1() throws IOException {
        NameSorter sorter = new NameSorter();
        String inFilePath = "src/test/java/assignment3/ex41/exercise41_test_input1.txt";
        String outFilePath = "src/test/java/assignment3/ex41/exercise41_test_output1.txt";

        ArrayList<String> expected = sorter.sortNamesFromFile(outFilePath);
        ArrayList<String> actual = sorter.sortNamesFromFile(inFilePath);
        assertEquals(expected,actual);
    }

    @Test
    void names_are_sorted_set2() throws IOException {
        NameSorter sorter = new NameSorter();
        String inFilePath = "src/test/java/assignment3/ex41/exercise41_test_input2.txt";
        String outFilePath = "src/test/java/assignment3/ex41/exercise41_test_output2.txt";

        ArrayList<String> expected = sorter.sortNamesFromFile(outFilePath);
        ArrayList<String> actual = sorter.sortNamesFromFile(inFilePath);
        assertEquals(expected,actual);
    }

    @Test
    void names_are_sorted_set3() throws IOException {
        NameSorter sorter = new NameSorter();
        String inFilePath = "src/test/java/assignment3/ex41/exercise41_test_input3.txt";
        String outFilePath = "src/test/java/assignment3/ex41/exercise41_test_output3.txt";

        ArrayList<String> expected = sorter.sortNamesFromFile(outFilePath);
        ArrayList<String> actual = sorter.sortNamesFromFile(inFilePath);
        assertEquals(expected,actual);
    }

    @Test
    void names_are_sorted_set4() throws IOException {
        NameSorter sorter = new NameSorter();
        String inFilePath = "src/test/java/assignment3/ex41/exercise41_test_input4.txt";
        String outFilePath = "src/test/java/assignment3/ex41/exercise41_test_output4.txt";

        ArrayList<String> expected = sorter.sortNamesFromFile(outFilePath);
        ArrayList<String> actual = sorter.sortNamesFromFile(inFilePath);
        assertEquals(expected,actual);
    }

    @Test
    void names_are_sorted_set5() throws IOException {
        NameSorter sorter = new NameSorter();
        String inFilePath = "src/test/java/assignment3/ex41/exercise41_test_input5.txt";
        String outFilePath = "src/test/java/assignment3/ex41/exercise41_test_output5.txt";

        ArrayList<String> expected = sorter.sortNamesFromFile(outFilePath);
        ArrayList<String> actual = sorter.sortNamesFromFile(inFilePath);
        assertEquals(expected,actual);
    }

}