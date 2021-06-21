/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment3.ex42;

import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class DataParserTest {

    @Test
    void correctly_parses_line_set1()
    {
        DataParser parser = new DataParser();
        String line = "Mai,Ling,55900";
        Employee expectedEmployee = new Employee("Ling", "Mai", "55900");
        Employee actualEmployee = parser.parseLineForObject(line);
        boolean expected = true;
        boolean actual = expectedEmployee.equals(actualEmployee);
    }

    @Test
    void correctly_parses_line_set2()
    {
        DataParser parser = new DataParser();
        String line = " , , ";
        Employee expectedEmployee = new Employee(" ", " ", " ");
        Employee actualEmployee = parser.parseLineForObject(line);
        boolean expected = true;
        boolean actual = expectedEmployee.equals(actualEmployee);
    }

    @Test
    void correctly_parses_line_set3()
    {
        DataParser parser = new DataParser();
        String line = "Saini , Jason , 0 ";
        Employee expectedEmployee = new Employee("Jason", "Saini", "0");
        Employee actualEmployee = parser.parseLineForObject(line);
        boolean expected = true;
        boolean actual = expectedEmployee.equals(actualEmployee);
    }
    @Test
    void correctly_parses_line_set4()
    {
        DataParser parser = new DataParser();
        String line = "WONKA, WILLY , 1 MILLION BILLION TRILLION DOLLARS ";
        Employee expectedEmployee = new Employee("WILLY", "WONKA", "1 MILLION BILLION TRILLION DOLLARS");
        Employee actualEmployee = parser.parseLineForObject(line);
        boolean expected = true;
        boolean actual = expectedEmployee.equals(actualEmployee);
    }

    @Test
    void correctly_parses_line_set5()
    {
        DataParser parser = new DataParser();
        String line = "abcdefghijklmnopqrstuvwxyz, zyxwvutsrqponmlkjihgfedcba, 12345678910";
        Employee expectedEmployee = new Employee("zyxwvutsrqponmlkjihgfedcba", "abcdefghijklmnopqrstuvwxyz", "12345678910");
        Employee actualEmployee = parser.parseLineForObject(line);
        boolean expected = true;
        boolean actual = expectedEmployee.equals(actualEmployee);
    }

}