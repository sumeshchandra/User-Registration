package com.regex;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scanner = new Scanner(System.in);
    boolean check;


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

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.checkFirstName();
    }
}
