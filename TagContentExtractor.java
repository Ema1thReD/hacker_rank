package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            String line = sc.nextLine();
            boolean matchFound = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher match = pattern.matcher(line);
            while (match.find()) {
                System.out.print(match.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.print("None");
            }
            testCases--;
        }
        sc.close();
    }
}
