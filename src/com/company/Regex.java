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

        /*
        Last name added
        */
        System.out.println("Enter Last name -> ");
        String lastName = sc.next();
        Matcher matcher2 = pattern.matcher(lastName);

        /*
        Adding Email
         */
        Pattern pattern1 = Pattern.compile("[a-z]{3,20}[@|.|-]?[0-9]{3,6}[@][a-z]{3,10}[.][a-z]{2,5}$");
        System.out.println("Enter email -> ");
        String eMail = sc.next();
        Matcher matcher3 = pattern1.matcher(eMail);
        
        /*
        Adding mobile number
         */
        Pattern pattern2 = Pattern.compile("^[0\\+91][6789][0-9]{9,13}");
        System.out.println("Enter the Mobile number -> ");
        String mobNumber = sc.next();
        Matcher matcher4 = pattern2.matcher(mobNumber);

        /*
        Create password
         */
        Pattern pattern3 = Pattern.compile("[a-z]{8}");
        System.out.println("Enter the password -> ");
        String passWord = sc.next();
        Matcher matcher5 = pattern3.matcher(passWord);

        if (matcher.find() && matcher2.find() && matcher3.find() && matcher4.find())
        System.out.println("Details Matched");
        else
        System.out.println("Details not matched");


    }
}