package com.company;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        char[] stringInChar = s.toCharArray();
        //System.out.println(stringInChar);
        String reverseInput = "";

        for (int i = stringInChar.length - 1; i >= 0; i--) {
            reverseInput = reverseInput + stringInChar[i];
        }
        if (s.equals(reverseInput))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
