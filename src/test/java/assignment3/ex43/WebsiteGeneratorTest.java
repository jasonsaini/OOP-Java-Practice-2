/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment3.ex43;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {
    @Test
    void correct_baseDir_string_set1()
    {
        WebsiteGenerator generator = new WebsiteGenerator();
        String siteName = "jasonssite";
        String expected = "src/main/java/assignment3/ex43/website/" + siteName;
        String actual = generator.createBaseDir(siteName);
        assertEquals(expected,actual);
    }

    @Test
    void correct_baseDir_string_set2()
    {
        WebsiteGenerator generator = new WebsiteGenerator();
        String siteName = "123456";
        String expected = "src/main/java/assignment3/ex43/website/" + siteName;
        String actual = generator.createBaseDir(siteName);
        assertEquals(expected,actual);
    }

    @Test
    void correct_baseDir_string_set3()
    {
        WebsiteGenerator generator = new WebsiteGenerator();
        String siteName = "JasonSainisWebsite";
        String expected = "src/main/java/assignment3/ex43/website/" + siteName;
        String actual = generator.createBaseDir(siteName);
        assertEquals(expected,actual);
    }

    @Test
    void created_baseDir_exists_set1()
    {
        WebsiteGenerator generator = new WebsiteGenerator();
        String testDir = null;
        try {
            testDir = generator.createBaseDirTest("site1");
        } catch (IOException e) {
            e.printStackTrace();
        }
        File baseDir = new File(testDir);
        boolean expected = true;
        boolean actual = baseDir.exists();
        assertEquals(expected,actual);

    }

    @Test
    void created_baseDir_exists_set2()
    {
        WebsiteGenerator generator = new WebsiteGenerator();
        String testDir = null;
        try {
            testDir = generator.createBaseDirTest("test_site_name");
        } catch (IOException e) {
            e.printStackTrace();
        }
        File baseDir = new File(testDir);
        boolean expected = true;
        boolean actual = baseDir.exists();
        assertEquals(expected,actual);
    }

    @Test
    void created_baseDir_exists_set3()
    {
        WebsiteGenerator generator = new WebsiteGenerator();
        String testDir = null;
        try {
            testDir = generator.createBaseDirTest("JasonSaini");
        } catch (IOException e) {
            e.printStackTrace();
        }
        File baseDir = new File(testDir);
        boolean expected = true;
        boolean actual = baseDir.exists();
        assertEquals(expected,actual);

    }

}