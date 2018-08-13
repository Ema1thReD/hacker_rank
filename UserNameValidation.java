package com.company;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserNameValidation {

    public static String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{8,30}$";
}

class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of username should to check");
        int i = Integer.parseInt(br.readLine());

        System.out.println("Enter the user name :");
        while (i-- != 0) {
            String s = br.readLine();
            if (s.matches(UserNameValidation.regularExpression)) {
                System.out.println("Valid");
            } else
                System.out.println("Invalid");
        }
        br.close();
    }
}

