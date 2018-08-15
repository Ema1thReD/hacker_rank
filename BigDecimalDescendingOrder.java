package com.company;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class BigDecimalDescendingOrder {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String obj1, String obj2) {
                BigDecimal b1 = new BigDecimal(obj1);
                BigDecimal b2 = new BigDecimal(obj2);
                return b2.compareTo(b1);
            }
        };
        Arrays.sort(s, 0, n, comparator);
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}
