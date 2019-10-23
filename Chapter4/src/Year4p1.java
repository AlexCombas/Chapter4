import java.util.Scanner;

public class Year4p1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year (enter negative number to quit): ");
		int year = scan.nextInt();

		while (year > 0) {
			if (year < 1583) {
				System.out.println("Error: year out of range.\n");
			} else {
				boolean leap = false;
				if (year % 4 == 0) {
					leap = true;
					if (year % 100 == 0) {
						if (year % 400 != 0) {
							leap = false;
						}
					}
				}
				System.out.println(year + " == leapyear => " + leap + "\n");
			}
			System.out.print("Enter a year (enter negative number to quit): ");
			year = scan.nextInt();
		}
		System.out.println("Quit");
		scan.close();

	}

}
