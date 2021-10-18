package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        System.out.println("Entering Details");
        /*
        First name entered
         */

        Pattern pattern = Pattern.compile("[A-Za-z]{3,}");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name -> ");
        String firstName = sc.next();
        Matcher matcher = pattern.matcher(firstName);

        if (matcher.find())
            System.out.println("Details Matched");
        else
            System.out.println("Details not matched");


    }
}