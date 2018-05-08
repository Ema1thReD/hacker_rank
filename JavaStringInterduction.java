package com.company;

import java.util.Scanner;

public class JavaStringInterduction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();

        int lenthA = A.length();
        int lenthB = B.length();

        int length = lenthA + lenthB;
        System.out.println(length);

        int compare = A.compareTo(B);

        if (compare > 0) {
            System.out.println("Yes");
        } else if (compare < 0) {
            System.out.println("No");
        }
        //System.out.println(("A "+ "B"));
        String s1 = A.substring(0, 1).toUpperCase();
        String nameCapitalizedA = s1 + A.substring(1);

        String s2 = B.substring(0, 1).toUpperCase();
        String nameCapitalizedB = s2 + B.substring(1);

        System.out.println(nameCapitalizedA + " " + nameCapitalizedB);

    }


}
