import java.util.Scanner;

public class Highest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, tmp;
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter a positive integer: ");
			tmp = scan.nextInt();
			if (tmp >= num) {
				num = tmp;
			}
		}
		System.out.println("Highest number entered: " + num);
		scan.close();

	}

}
