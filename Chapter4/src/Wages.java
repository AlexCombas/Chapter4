import java.text.NumberFormat;
import java.util.Scanner;

public class Wages {
	public static void main (String[] args) {
		final double RATE = 8.25;
		final int STD = 40;
		
		Scanner scan = new Scanner(System.in);
		double pay = 0.0;
		
		System.out.print("Enter number of hours worked: ");
		int hours = scan.nextInt();
		if (hours > STD) {
			pay = STD * RATE + (hours - STD) * (RATE * 1.5);
		} else {
			pay = hours * RATE;
		}
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println("Gross earnings: " + currency.format(pay));
		scan.close();
	}
}
