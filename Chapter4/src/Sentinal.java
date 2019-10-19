import java.util.Scanner;

public class Sentinal {
	public static void main (String[] args) {
		final int SENTINAL = -1;
		Scanner scan = new Scanner (System.in);
		int num;
		do {
			System.out.print("Enter an integer, -1 to stop: ");
			num = scan.nextInt();
		} while (num != SENTINAL);
		System.out.println("You entered -1");
		scan.close();
	}
}
