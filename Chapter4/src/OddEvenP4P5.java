import java.util.Scanner;

public class OddEvenP4P5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a multi digit number: ");
		int num = scan.nextInt();
		int even = 0, odd = 0, zero = 0, tmp = 0;
		while (num > 0) {
			tmp = num % 10;
			if (tmp == 0) {
				zero++;
			} else {
				if (tmp % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
			num /= 10;
		}
		System.out.println("Even: " + even + "\nOdd: " + odd + "\nZero: " + zero + "\n");
		scan.close();
	}

}
