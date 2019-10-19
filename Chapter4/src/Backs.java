import java.util.Scanner;

public class Backs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Write a short sentence: ");
		String str = scan.nextLine();
		int len = str.length();
		String bak = "";
		for (int i = 1; i <= len; i++) {
			bak += str.charAt(len-i);
		}
		System.out.println(bak);
		scan.close();
	}
}
