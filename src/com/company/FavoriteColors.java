package com.company;

import java.util.Scanner;

public class FavoriteColors {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

       // Create Person object
        Person person = new Person();

        // Declare int variable to store user input for the keys in ArrayList
        // Declare and initialize loop count
        String color, userName;
        int loopCount = 0;
        // Declare and initialize String variable to yes to enter the while loop
        String answer = "yes";

        System.out.print("Enter user's name: ");
        userName = keyboard.nextLine();
        person = new Person(userName);

        while (answer.equalsIgnoreCase("yes")) {

            // Display "Enter a color: " without a newline character
            //    before it if it's the first time shown
            // Otherwise, don't include the newline character
            System.out.print("\nEnter favorite color: ");
            // Receive integer from the user
            color = keyboard.nextLine();

            if (person.getFavoriteColors().contains(color)) {
                // If the entered integer is a current key in the ArrayList, display its value
                System.out.println("You entered " + color);
                // Ask the user whether he/she wants to continue entering colors and get its answer
                System.out.print("Would you like to continue " +
                        "entering colors (\"yes\" or \"no\")? ");
                answer = keyboard.nextLine();
            } else {
                // If the entered integer is not a current key in the ArrayList,
                // let the user designate a value for it
                System.out.print("Would you like to add this color to " +
                        "the favorite list (\"yes\" or \"no\")? ");
                answer = keyboard.nextLine();

                if (answer.equalsIgnoreCase("yes")) {
                    // Add the key and value from user input
                    person.setFavoriteColors(color);
                }

                // Ask the user whether he/she wants to continue entering colors and get its answer
                System.out.print("Would you like to continue entering colors (\"yes\" or \"no\")? ");
                answer = keyboard.nextLine();
            }

            // Increase loop count to one
            loopCount++;
        }

        System.out.println("\n\nPerson's Name:");
        System.out.println("----------------------");
        System.out.println(person.getUserName());

        System.out.println("\nFavorite Colors:");
        System.out.println("----------------------");
        for (String s: person.getFavoriteColors()) {
            System.out.println(s);
        }

    }
}
