/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment3.ex44;



import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ProductSearchTest {

    @Test
    void returns_null_for_missing_item_set1()
    {
        ProductSearch search = new ProductSearch();
        try {
            Product searched = search.parseJSONTest("test1.json", "iPad");
            boolean expected = true;
            boolean actual = (searched == null);
            assertEquals(expected,actual);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    void returns_null_for_missing_item_set2()
    {
        ProductSearch search = new ProductSearch();
        try {
            Product searched = search.parseJSONTest("test2.json", "Widget");
            boolean expected = true;
            boolean actual = (searched == null);
            assertEquals(expected,actual);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    void returns_null_for_missing_item_set3()
    {
        ProductSearch search = new ProductSearch();
        try {
            Product searched = search.parseJSONTest("test3.json", "Doodad");
            boolean expected = true;
            boolean actual = (searched == null);
            assertEquals(expected,actual);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}