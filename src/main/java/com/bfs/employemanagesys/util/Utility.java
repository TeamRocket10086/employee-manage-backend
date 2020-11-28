package com.bfs.employemanagesys.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Description: <br>
 *
 * @author: Billy <br>
 * @createDate: 2020-11-27 <br>
 */
public class Utility {
    public static void displayText(InputStream input) throws IOException {
        // Read one text line at a time and display.
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        while (true) {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println("    " + line);
        }
    }
}
