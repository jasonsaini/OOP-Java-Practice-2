/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment3.ex44;

import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution44 {
    public static void main (String args[]) throws IOException, ParseException {
        ProductSearch search = new ProductSearch();
        Scanner in = new Scanner(System.in);

        // Create loop for valid product key
        Product searchedProduct = null;
        while(searchedProduct == null)
        {
            String searchKey = search.promptSearchKey();;
            searchedProduct = search.parseJSON(searchKey);

            // if product is found, break out of prompting loop
            if(searchedProduct != null)
            {
                break;
            }
            else
            {
                System.out.println("Sorry, that product was not found in our inventory.");
            }
        }
        // Output Product information
        System.out.println("Name: " + searchedProduct.name);
        System.out.printf("Price: %.2f\n" ,searchedProduct.price);
        System.out.println("Quantity: " + searchedProduct.quantity);
    }
}
