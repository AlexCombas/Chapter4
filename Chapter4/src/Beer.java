import java.util.Scanner;
public class Beer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Number of bottles of beer on the wall? ");
		int num = scan.nextInt();
		while (num > 0) {
			System.out.println(num + " bottles of beer on the wall");
			System.out.println(num + " bottles of beer");
			System.out.println("If one of those bottles should happen to fall");
			System.out.println(num - 1 + " bottles of beer on the wall");
			num--;
		}
		scan.close();

	}

}
