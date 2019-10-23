import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String words = scan.nextLine().toLowerCase();
		int a=0, e=0, i=0, o=0, u=0, other=0;
		for (int j=0; j<words.length(); j++) {
			char c = words.charAt(j);
			if (c == 'a') {
				a++;
			} else if (c == 'e') {
				e++;
			} else if (c == 'i') {
				i++;
			} else if (c == 'o') {
				o++;
			} else if (c == 'u') {
				u++;
			} else {
				other++;
			}
		}
		System.out.println("a : " + a);
		System.out.println("e : " + e);
		System.out.println("i : " + i);
		System.out.println("o : " + o);
		System.out.println("u : " + u);
		System.out.println("Other : " + other);

		
		
		scan.close();
	}

}
