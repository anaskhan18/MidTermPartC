/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author khani
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to User Profile Creation!");

        // Getting user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Displaying list of possible genres
        System.out.println("Choose your favorite genre:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Getting user's choice of genre
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int choice = scanner.nextInt();

        String genre;
        switch (choice) {
            case 1:
                genre = "Comedy";
                break;
            case 2:
                genre = "Drama";
                break;
            case 3:
                genre = "Action";
                break;
            case 4:
                genre = "Mystery";
                break;
            default:
                genre = "Unknown";
        }

        // Generating a random userID (for demonstration purposes)
        String userID = generateUserID();

        // Creating and displaying user profile
        UserProfile userProfile = new UserProfile(userID, genre);
        System.out.println("Your user profile was created successfully:");
        System.out.println("User ID: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());
    }

    // Method to generate a random userID (for demonstration purposes)
    private static String generateUserID() {
        return "UID" + (int)(Math.random() * 1000);
    }
}