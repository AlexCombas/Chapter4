import java.util.Scanner;
import java.util.Random;

public class HiLow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int r = rand.nextInt(100) + 1;
		System.out.println("Guess a number between 1 and 100 (zero to quit): ");
		int guess = scan.nextInt();
		int attempts = 1;
		while (guess != 0) {

			if (guess == r) {
				System.out.println("You guessed it! The number was " + r);
				System.out.println("Total guesses: " + attempts);
				guess = 0; // quit
			} else if (guess > r) {
				System.out.println("To high, try again.");
				guess = scan.nextInt();
				attempts++;
			} else {
				System.out.println("To low, try again.");
				guess = scan.nextInt();
				attempts++;
			}
		}
		scan.close();
	}

}
