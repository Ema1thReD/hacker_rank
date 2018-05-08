package com.company;

import java.util.Scanner;

public class WordCountAndPrintIndividualWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] wordArray = s.trim().split("\\s+");
        int count = wordArray.length;
        System.out.println(count);
        for (String str : s.split("")) {
            System.out.println(str);
        }

        // Write your code here.
        scan.close();
    }

}
