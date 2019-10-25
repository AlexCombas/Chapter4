/*	File: HiLow.java
 * 	Author: Alex Combas
 * 	TRUid: 	T00655895
 * 	Course: COMP 1131 Assignment 3 Question 1
 * 	
 * 	Description: An application that plays the Hi-Lo guessing game with numbers. 
 * The program should pick a random number between 1 and 100 (inclusive), then 
 * repeatedly prompt the user to guess the number. On each guess, report to the 
 * user that he or she is correct or that the guess is high or low. Continue 
 * accepting guesses until the user guesses correctly or chooses to quit. Count 
 * the number of guesses and report that value when the user guesses correctly. 
 * At the end of each game (by quitting or a correct guess), prompt to determine 
 * whether the user wants to play again. Continue playing games until the user 
 * chooses to stop.
 */


import java.util.Scanner;
import java.util.Random;

public class HiLow {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		// A random number between 1 to 100 inclusive
		int r = rand.nextInt(100) + 1;

		// The number of times the user makes a guess, zero attempts means a new game.
		int attempts = 0;

		// Guess stores the users input, a guess of zero ends the game.
		int guess = 1;

		// Prompt the user to play again after winning. Anything other than "y" will 
		// end the game.
		String playAgain;

		// The single game loop uses two sentinel values.
		// The value of guess=0 can be used at any time to end the game.
		// The value of play is only prompted for after the user completes a game.
		while (guess != 0) {
			if (attempts == 0) {
				// Prompt user for a first guess 
				System.out.print("Guess a number between 1 and 100 (zero to quit): ");
				guess = scan.nextInt();
				attempts = 1;
			}
			
			// The winning guess
			if (guess == r) {
				System.out.println("You guessed it! The number was " + r);
				System.out.println("Total guesses: " + attempts);
				System.out.print("\nPlay again? (y/n): ");

				// Consume a newline so that the following nextLine() works. This is an 
				// issue because scan.nextInt() does not consume the newline. 
				// After researching the topic this could be fixed by using 
				// playAgain = Integer.parseInt(scan.nextLine()) which would get the 
				// integer and also consume the newline, but we haven't covered that yet.
				scan.nextLine();
				playAgain = scan.nextLine().toLowerCase();

				// Setup variables for the next game if the user selects to play again.
				// Otherwise set guess to zero to say "Goodbye" and end the game.
				if (playAgain.equals("y")) {
					r = rand.nextInt(100) + 1;
					attempts = 0;
				} else {
					guess = 0;
				}
			} else if (guess > r && guess > 0 && guess < 101) {
				// Make sure guess is within bounds 1 and 100 if is too high or too low.
				System.out.print("Too high, try again? (zero to quit): ");
				guess = scan.nextInt();
				attempts++;
			} else if (guess < r && guess > 0 && guess < 101) {
				System.out.print("Too low, try again? (zero to quit): ");
				guess = scan.nextInt();
				attempts++;
			} else if (guess == 0) {
				// If the user enters zero as their very first guess then we must catch 
				// it here so that it is not caught by the final else catch-all clause.
			} else {
				// If number is not the correct answer, not zero, and not in range, then 
				// it must be an out of bounds error.
				System.out.print("Error Number Out Of Range. Try again? (zero to quit): ");
				guess = scan.nextInt();
				attempts++;
			}

			// If user ends the game then say Goodbye. The while loop will stop
			// when it checks the value of guess at the beginning of the next loop.
			// Goodbye is not in the specification, but seems like a good idea.
			if (guess == 0) {
				System.out.println("Goodbye");
			}
		}
		scan.close();
	}

}
