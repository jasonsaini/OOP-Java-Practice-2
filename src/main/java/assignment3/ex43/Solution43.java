/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment3.ex43;

import java.io.IOException;

public class Solution43 {
    public static void main(String args[]) throws IOException {
        WebsiteGenerator generator = new WebsiteGenerator();
        String siteName, siteAuthor;
        boolean wantsJSFolder, wantsCSSFolder;

        // Prompt for site name
        siteName = generator.promptSiteName();

        // prompt for author of the site
        siteAuthor = generator.promptSiteAuthor();

        // ask if user wants a folder for JavaScript files
        wantsJSFolder = generator.promptForJSFolder();

        // ask if the user wants a folder for CSS files
        wantsCSSFolder = generator.promptForCSSFolder();

        // Create base directory
        String baseDir = generator.createBaseDirTest(siteName);

        // Generate an index.html that contains the name of the site inside the <title> tag and the author in a <meta> tag
        generator.generateHTML(siteName,siteAuthor);

        // Generate JavaScript and CSS folders based on prompts
        if(wantsJSFolder)
        {
            generator.createJSDir(baseDir);
        }

        if(wantsCSSFolder)
        {
            generator.createCSSDir(baseDir);
        }

    }


}
