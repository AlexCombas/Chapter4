
public class OddFor {
	public static void main(String[] args) {
		for (int i = 0; i <= 99; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		for (int i = 300; i > 2; i--) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}
