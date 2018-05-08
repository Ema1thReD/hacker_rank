package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CheckStringIsAnagramOrNot {


    static boolean isAnagram(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        } else {
            char[] str1 = A.toLowerCase().toCharArray();
            char[] str2 = B.toLowerCase().toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            return Arrays.equals(str1, str2);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }

}
