/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment3.ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution42 {
    public static void main(String args[]) throws FileNotFoundException {
        // Initialize input file and scanners
        final String inFileName = "src/main/java/assignment3/ex42/exercise42_input.txt";
        File infile = new File(inFileName);
        Scanner scanner = new Scanner(new FileReader(inFileName));

        // Initialize employee list and parser object
        DataParser parser = new DataParser();
        ArrayList<Employee>  employees = new ArrayList<Employee>();

        // Store data into array of objects
        while(scanner.hasNextLine())
        {
            employees.add(parser.parseLineForObject(scanner.nextLine()));
        }
        // Print output
        parser.outputEmployeeInfo(employees);
    }

}
