package com.company;

import java.util.Scanner;

public class Java1DArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int a[] = new int[length];
        for (int n = 0; n < length; n++) {
            a[n] = scan.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
