/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment3.ex42;

import java.util.ArrayList;

public class DataParser {
    public static Employee parseLineForObject(String line)
    {
        // create an array of substrings from original line
        String [] fields = line.split(",");
        // create Employee object using each element
        Employee returnEmployee = new Employee(fields[0], fields[1], fields[2]);
        return returnEmployee;
    }

    public static void outputEmployeeInfo(ArrayList<Employee> employees)
    {
        final int maxlength = 25;
        // Print table header
        System.out.format("%-15s%-15s%-15s\n", "Last", "First", "Salary");
        System.out.println("------------------------------------");
        // iterate through employee list
        for(int i = 0; i < employees.size(); i++)
        {
            // Print each Employee attribute
            Employee current = employees.get(i);
            System.out.printf("%-15s", current.lastName);
            System.out.printf("%-15s", current.firstName);
            System.out.printf("%-15s\n", current.salary);
        }

    }




}
