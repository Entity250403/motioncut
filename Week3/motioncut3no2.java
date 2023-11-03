/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akashscherian
 */
import java.util.Random;
import java.util.Scanner;
public class motioncut3no2 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1; // Define the lower bound of the range
        int upperBound = 100; // Define the upper bound of the range
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound; // Generate a random number
        
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();
            attempts++;

            if (playerGuess < lowerBound || playerGuess > upperBound) {
                System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + ".");
            } else if (playerGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else if (playerGuess > numberToGuess) {
                System.out.println("Try a lower number.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
