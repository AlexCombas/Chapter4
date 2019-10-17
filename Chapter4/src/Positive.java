import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = -1;
		while (num <= 0) {
			System.out.println("Enter a positive integer: ");
			num = sc.nextInt();
		}
		System.out.println("You entered a positive integer.");
		sc.close();
	}
}
