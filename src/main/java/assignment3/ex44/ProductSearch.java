/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment3.ex44;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class ProductSearch {

    public static String promptSearchKey()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the product name? ");
        String productName = in.nextLine();
        return productName;
    }

    public static Product parseJSON(String key) throws IOException, ParseException {
        // create JSON Parser based on .json file location
        Object obj = new JSONParser().parse(new FileReader("src/main/java/assignment3/ex44/exercise44_input.json"));
        // instantiate array and iterator based on json file
        JSONObject object =(JSONObject) obj ;
        JSONArray array = (JSONArray) object.get("products");
        Iterator i = array.iterator();
        // iterate through entire file
        while(i.hasNext())
        {
            JSONObject currentObj = (JSONObject) i.next();
            // if the key matches an object name, return a product object with matching attributes
            if(currentObj.get("name").equals(key))
            {
                String pName = (String) currentObj.get("name");
                double pPrice = (double) currentObj.get("price");
                long pQuant = (long) currentObj.get("quantity");
                return new Product(pName, pPrice, (int)pQuant);
            }
        }
        // if file does not contain matching product, return null
        return null;
    }
    // used for unit testing, works in test directory
    public static Product parseJSONTest(String fileName, String key) throws IOException, ParseException {
        // create JSON Parser based on .json file location
        Object obj = new JSONParser().parse(new FileReader("src/test/java/assignment3/ex44/" + fileName));
        // instantiate array and iterator based on json file
        JSONObject object =(JSONObject) obj ;
        JSONArray array = (JSONArray) object.get("products");
        Iterator i = array.iterator();
        // iterate through entire file
        while(i.hasNext())
        {
            JSONObject currentObj = (JSONObject) i.next();
            // if the key matches an object name, return a product object with matching attributes
            if(currentObj.get("name").equals(key))
            {
                String pName = (String) currentObj.get("name");
                double pPrice = (double) currentObj.get("price");
                long pQuant = (long) currentObj.get("quantity");
                return new Product(pName, pPrice, (int)pQuant);
            }
        }
        // if file does not contain matching product, return null
        return null;
    }




}
