package com.profile.userProfile;

import java.util.Scanner;

public class userDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading user input of user name
        System.out.println("What is your name:");
        String userName = scanner.nextLine();

        // Reading user input of gender
        System.out.println("What is your gender:");
        String userGender = scanner.nextLine();

        boolean isValid;
        String userMobileNo;
        do {
            // Reading user input of user mobile no
            System.out.println("What is your mobile no:");
            userMobileNo = scanner.nextLine();

            isValid = userMobileNo.matches("\\d{10}");
            if (!isValid) {
                System.out.println("Invalid mobile no, enter again:");
            }
        } while (!isValid);

        // Reading user input of users age
        System.out.println("What is your age:");
        int userAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        // Reading user input of user's email
        System.out.println("What is your email id:");
        String userEmail = scanner.nextLine();

        // Reading user input of created password
        System.out.println("Create password:");
        String createPassword = scanner.nextLine();

        // Reading user input of confirmed password
        System.out.println("Confirm your password:");
        String confirmPassword = scanner.nextLine();

        if (createPassword.equals(confirmPassword)) {
            System.out.println("Profile created successfully!!\n");
            System.out.println("\nUser name :"+userName + "\nGender :" + userGender + "\nMobile no :" + userMobileNo + "\nAge :" + userAge + "\nEmail :" + userEmail);
        } else {
            System.out.println("Check password again!!");
        }

        scanner.close();
    }
}
