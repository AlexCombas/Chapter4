
public class EveryOther {

	public static void main(String[] args) {
		String word = "believe";
		for (int i = 0; i < word.length(); i++) {
			if (i % 2 == 0) {
				System.out.println(word.charAt(i));
			}
		}
		

	}

}
