import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter character: ");
		String str = scan.nextLine().toLowerCase();
		char c = str.charAt(0);
		switch (c) {
		case 'a':
			for (int i = 0; i < 10; i++) {
				for (int j = 10 - i; j > 0; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 'b':
			for (int i = 1; i < 11; i++) {
				for (int j = 10 - i; j > 0; j--) {
					System.out.print(" ");
				}
				for (int x = 0 + i; x > 0; x--) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 'c':
			for (int i = 0; i < 10; i++) {
				for (int j = 10 - i; j < 10; j++) {
					System.out.print(" ");
				}
				for (int x = 10 - i; x > 0; x--) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;

		case 'd':
			int count = 5;
			for (int i = 5; i < 10; i++) {
				count--;
				for (int j = count; j > 0; j--) {
					System.out.print(" ");
				}
				for (int k = i - count; k > 0; k--) {
					System.out.print("*");
				}
				System.out.println();
			}
			count = 0;
			for (int x = 9; x > 4; x--) {
				for (int y = count; y > 0; y--) {
					System.out.print(" ");
				}
				for (int z = x - count; z > 0; z--) {
					System.out.print("*");
				}
				System.out.println();
				count++;
			}
			break;
		}
		scan.close();
	}
}
