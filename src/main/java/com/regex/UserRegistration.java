package com.regex;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scanner = new Scanner(System.in);
    boolean check;

    /**
     * This checkFirstname method will check the user input according to the pattern.
     * for this operation i have imported regex module and Scanner module.
     */
    public void checkFirstName() {
        System.out.println("Enter First-name starts with capital letter and has minimum 3 character : ");
        String firstName = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher((firstName));
        check = matcher.matches();
        if (check) {
            System.out.println("Firstname is Valid");
        } else {
            System.out.println("Invalid!!Please Enter your name according to the instruction.");
        }
    }

    /**
     * This checkLastname method will check the user input according to the pattern.
     */
    public void checkLastName() {
        System.out.print("Enter Last-name starts with capital letter : ");
        String LastName = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]+");
        Matcher matcher = pattern.matcher(LastName);
        check = matcher.matches();
        if (check) {
            System.out.println("Lastname is Valid");
        } else {
            System.out.println("Invalid!!Please Enter your name according to the instruction.");
        }
    }

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.checkFirstName();
        userRegistration.checkLastName();
    }
}
