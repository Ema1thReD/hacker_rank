package com.company;

import java.util.Scanner;

public class PrintElementsInSpecifiedRangeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();

        String range = s.substring(start, end);

        System.out.println(range);
    }
}
