/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment3.ex43;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.lang.*;
import org.apache.commons.io.FileUtils;

public class WebsiteGenerator {
    public static Scanner in = new Scanner(System.in);
    public static File HTMLFile = new File("src/main/java/assignment3/ex43/template.html");

    public static String promptSiteName()
    {
        System.out.print("Site name: ");
        String siteName = in.nextLine();
        // removes whitespaces from sitename to prevent directory errors
        siteName = siteName.replaceAll("\\s","");
        return siteName;
    }

    public static String promptSiteAuthor()
    {
        System.out.print("Author: ");
        String author = in.nextLine();
        return author;
    }

    public static boolean promptForJSFolder()
    {
        String buffer;
        System.out.print("Do you want a folder for JavaScript? ");
        buffer = in.nextLine();
        // trim buffer for 'y' or 'n'
        char choice = Character.toLowerCase(buffer.charAt(0));
        return (choice == 'y');
    }

    public static boolean promptForCSSFolder()
    {
        String buffer;
        System.out.print("Do you want a folder for CSS? ");
        buffer = in.nextLine();

        // trim buffer for 'y' or 'n'
        char choice = Character.toLowerCase(buffer.charAt(0));
        return(choice == 'y');
    }

    public static void generateHTML(String siteName, String siteAuthor) throws IOException {
        // convert HTML file to sting
        String htmlString = FileUtils.readFileToString(HTMLFile);

        // Perform string replacements on title and author attributes
        htmlString = htmlString.replace("$title", siteName);
        htmlString = htmlString.replace("$author", siteAuthor);

        // create a new HTML file dir from new html String
        File newHTML = new File("src/main/java/assignment3/ex43/website/" + siteName + "/index.html");
        System.out.println("Created " + "src/main/java/assignment3/ex43/website/" + siteName + "/index.html");

        // Write string to created HTML file
        FileUtils.writeStringToFile(newHTML, htmlString);
    }

    // use for unit testing (creates directory in corresponding test package)
    public static void generateHTMLTest(String siteName, String siteAuthor) {
        try
        {
            String htmlString = FileUtils.readFileToString(HTMLFile);
            htmlString = htmlString.replace("$title", siteName);
            htmlString = htmlString.replace("$author", siteAuthor);
            File newHTML = new File("src/test/java/assignment3/ex43/website/" + siteName + "/index.html");
            System.out.println("Created " + "src/test/java/assignment3/ex43/website/" + siteName + "/index.html");
            FileUtils.writeStringToFile(newHTML, htmlString);
        }
        catch(IOException e)
        {
            System.out.println("HTML generation fail!");
        }

    }

    public static String createBaseDir(String siteName)
    {
        // concatenate site name to base directory
        String dir = "src/main/java/assignment3/ex43/website/" + siteName;
        // create directory object
        File baseDir = new File(dir);
        // check if directory exits
        if(!baseDir.exists())
        {
            // print output and create directory
            System.out.println("Created " + dir);
            baseDir.mkdir();
        }
        return dir;
    }

    // for unit testing, creates base directory in test directory
    public static String createBaseDirTest(String siteName) throws IOException {
        String dir = "src/test/java/assignment3/ex43/website/" + siteName;
        File baseDir = new File(dir);
        if(!baseDir.exists())
        {
            System.out.println("Created " + dir);
            baseDir.mkdir();
        }
        createJSDir(dir);
        createCSSDir(dir);
        generateHTMLTest(siteName, "Jason Saini");
        return dir;
    }


    public static void createJSDir(String baseDir)
    {
        String dir = baseDir + "/js/";
        File JSDir = new File(dir);
        if(!JSDir.exists())
        {
            System.out.println("Created " + dir);
            JSDir.mkdir();
        }
        return;
    }

    public static void createCSSDir(String baseDir)
    {
        String dir = baseDir + "/css/";
        File CSSDir = new File(dir);
        if(!CSSDir.exists())
        {
            System.out.println("Created " + dir);
            CSSDir.mkdir();
        }
        return;
    }





}
