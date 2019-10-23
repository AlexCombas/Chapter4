import java.util.Scanner;
import java.util.Random;

public class Jackpot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String again = "y";
		int megawin = 0, win = 0, games = 0;
		
		while (again.equals("y")) {
			int slot1 = rand.nextInt(9) + 1;
			int slot2 = rand.nextInt(9) + 1;
			int slot3 = rand.nextInt(9) + 1;
			System.out.println("\n" + slot1 + "\t" + slot2 + "\t" + slot3 );

			if (slot1 == slot2 && slot1 == slot3) {
				System.out.println("Mega Jackpot Winner!!!");
				megawin++;
				games++;
			} else if (slot1 == slot2 || slot1 == slot3 || slot2 == slot3) {
				System.out.println("Double match winner!");
				win++;
				games++;
			} else {
				System.out.println("Better luck next time.");
				games++;
			}
			System.out.print("Play again? (y/n): ");
			again = scan.nextLine().toLowerCase();
			if (again.equals("n")) {
				System.out.println("\nMega Jackpot (3 matched): " + megawin);
				System.out.println("Jackpot (2 matched):" + win);
				System.out.println("Games (total): " + games);
			}
		}
		scan.close();
	}

}
