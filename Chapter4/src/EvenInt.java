import java.util.Scanner;

public class EvenInt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 1;
		do {
			System.out.print("Enter an even integer: ");
			num = scan.nextInt();
		} while (num % 2 != 0);
		System.out.println("You entered an even integer.");
		scan.close();
	}
}
