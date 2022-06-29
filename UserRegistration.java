package com.bridzlabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println(" Welcome to UserRegistration program using Regex ");
        boolean firstName = Pattern.matches("[A-Z][a-z]{3,}", "Aviligonda");
        System.out.println("FirstName : "+firstName);
        boolean lastName = Pattern.matches("[A-Z][a-z]{3,}", "Sreenivasulu");
        System.out.println("LastName : "+lastName);
        boolean email = Pattern.matches("[a-z\\d]{5,}@[a-z]{5}.[a-z]{2,}.[a-z]{2,}", "aviligondasreenivasulu6086@gmail.com.in");
        System.out.println("Email :"+email);
    }
}
