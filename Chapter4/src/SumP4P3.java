import java.util.Scanner;

public class SumP4P3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integeter: ");
		int num = scan.nextInt();
		if (num < 2) {
			System.out.println("Error, integer must be greater than 1");
		} else {
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
