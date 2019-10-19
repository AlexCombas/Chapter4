
import java.util.Scanner;

public class Zees {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence with 'z' characters: ");
		String name = scan.nextLine();
		int counter = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'z') {
				counter++;
			}
		}
		System.out.println("The character 'z' occurs " + counter + " times.");
		scan.close();
	}
}
