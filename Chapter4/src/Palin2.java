import java.util.Scanner;

public class Palin2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str, another = "y";
		int left, right;

		while (another.equalsIgnoreCase("y")) {
			System.out.println("Enter a potential palindrome: ");
			str = scan.nextLine().toLowerCase();
			left = 0;
			right = str.length() - 1;

			String l = null, r = null;

			for (int i = 0; i < (str.length() / 2) + 1; i++) {
				if (str.charAt(left) == ' ' || str.charAt(left) == ',' || str.charAt(left) == '.'
						|| str.charAt(left) == ';') {
					left++;
					if (str.charAt(left) == ' ' || str.charAt(left) == ',' || str.charAt(left) == '.'
							|| str.charAt(left) == ';') {
						left++;
					}
				}
				if (str.charAt(right) == ' ' || str.charAt(right) == ',' || str.charAt(right) == '.'
						|| str.charAt(right) == ';') {
					right--;
					if (str.charAt(right) == ' ' || str.charAt(right) == ',' || str.charAt(right) == '.'
							|| str.charAt(right) == ';') {
						right--;
					}
				}
				if (left < right) {
					l += str.charAt(left);
					r += str.charAt(right);
					left++;
					right--;
				}

			}

			System.out.println();
			if (l.equals(r)) {
				System.out.println("That text IS a palindrome.");
			} else {
				System.out.println("That text is NOT a palindrome.");
			}
			System.out.println();
			System.out.println("Test another palindrome? (y/n): ");
			another = scan.nextLine();
		}
		scan.close();

	}

}
