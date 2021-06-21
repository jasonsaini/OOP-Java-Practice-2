/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment3.ex45;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {


    String  input1 = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
            "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
            "utilizes an IDE to write her Java programs\".";

    String input2 = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
            "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
            "uses an IDE to write her Java programs\".";

    String input3 = "this";
    public static String replaceOccurrenceTest(String in, String s1, String s2) throws IOException {
        return in.replace(s1,s2);
    }

    @Test
    void correctly_replaces_occurences_set1() throws IOException {
        WordFinder finder = new WordFinder();
        String expected = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".";
        String actual = replaceOccurrenceTest(input1,"utilize", "use");
        assertEquals(expected,actual);
    }

    @Test
    void correctly_replaces_occurences_set2() throws IOException {
        WordFinder finder = new WordFinder();
        String expected = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"He uses an IDE to write his Java programs\" instead of \"He\n" +
                "uses an IDE to write his Java programs\".";
        String actual = replaceOccurrenceTest(replaceOccurrenceTest(input2,"She", "He"), "her","his");
        assertEquals(expected,actual);
    }

    @Test
    void correctly_replaces_occurences_set3() throws IOException {
        WordFinder finder = new WordFinder();
        String expected = "that";
        String actual = replaceOccurrenceTest(input3, "this", "that");
        assertEquals(expected,actual);
    }


}