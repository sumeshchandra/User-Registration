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

    /**
     * Added checkEmail method to match the email ids according to the given pattern.
     */
    public void checkEmail() {
        System.out.println("Enter a valid email(Eg. abc.xyz@bl.com) : ");
        String lastName = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]{2,14}+@(.+).com$");
        Matcher matcher = pattern.matcher((lastName));
        boolean check = matcher.matches();
        if (check) {
            System.out.println("Email Id is Valid");
        } else {
            System.out.println(" Invalid!!Email-id...Please Enter a Valid one. ");
        }
    }

    /**
     * This checkPhoneNumber method will check the user input(Mobile Number) according to the pattern.
     */
    public void checkPhoneNumber() {
        System.out.println("Enter Your Mobile Number (Eg. 91 9919819801) : ");
        String phoneNumber = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[0-9]{1,2}\\s{1}[0-9]{10}");
        Matcher matcher = pattern.matcher((phoneNumber));
        boolean check = matcher.matches();
        if (check) {
            System.out.println("Number is Valid");
        } else {
            System.out.println(" Number is invalid!!Please Enter a Valid one.");
        }
    }

    /**
     * UC5:This method is used to take the Password as input and
     * checks if it is valid or not.
     * Rule1: Minimum 8 characters
     */
    public void checkPassword() {
        System.out.println("Enter Password(8 character): ");
        String password = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-z A-Z 0-9]{8,}$");
        Matcher matcher = pattern.matcher((password));
        boolean check = matcher.matches();
        if (check) {
            System.out.println("Password is Valid");
        } else {
            System.out.println(" Invalid Password!! Enter a valid one.");
        }
    }

        public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
//        userRegistration.checkFirstName();
//        userRegistration.checkLastName();
//        userRegistration.checkEmail();
//        userRegistration.checkPhoneNumber();
        userRegistration.checkPassword();
    }
}
