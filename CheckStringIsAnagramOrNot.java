package com.company;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
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

    static class BigDecimalDescndingOrder {
        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            String s[] = new String[n + 2];
            for (int i = 0; i < n; i++) {
                s[i] = scan.next();
            }
            Comparator customComparator = new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    BigDecimal a = new BigDecimal(s1);
                    BigDecimal b = new BigDecimal(s2);
                    return 0;
                }
            };
            Arrays.sort(s, 0, n, customComparator);
            for (int i = 0; i < n; i++) {
                System.out.println(s[i]);
            }
        }
    }
}
