import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose (r)ock, (p)aper, (s)cissors (q to quit): ");
		String move = scan.nextLine().toLowerCase();
		String ai = null;
		int wins = 0, loses = 0, ties = 0;
		while (move.charAt(0) != 'q') {
			int r = rand.nextInt(3) + 1;
			if (r == 1) {
				ai = "r";
			} else if (r == 2) {
				ai = "p";
			} else {
				ai = "s";
			}
			switch (ai.charAt(0)) {
			case 'r':
				System.out.print("\nComputer: rock\t");
				if (move.equals("r")) {
					System.out.println("User: rock");
					System.out.println("Tie!");
					ties++;
				} else if (move.equals("p")) {
					System.out.println("User: paper");
					System.out.println("You beat the computer!");
					wins++;
				} else if (move.equals("s")){
					System.out.println("User: scissors");
					System.out.println("The computer wins!");
					loses++;
				} else {
					System.out.println("Invalid input.");
				}
				break;
			case 'p':
				System.out.print("\nComputer: paper\t");
				if (move.equals("r")) {
					System.out.println("User: rock");
					System.out.println("The computer wins!");
					loses++;
				} else if (move.equals("p")) {
					System.out.println("User: paper");
					System.out.println("Tie!");
					ties++;
				} else if (move.equals("s")){
					System.out.println("User: scissors");
					System.out.println("You beat the computer!");
					wins++;
				} else {
					System.out.println("Invalid input.");
				}
				break;
			case 's':
				System.out.print("\nComputer: scissors\t");
				if (move.equals("r")) {
					System.out.println("User: rock");
					System.out.println("You beat the computer");
					wins++;
				} else if (move.equals("p")) {
					System.out.println("User: paper");
					System.out.println("The computer beat you!");
					loses++;
				} else if (move.equals("s")){
					System.out.println("User: scissors");
					System.out.println("Tie!");
					ties++;
				} else {
					System.out.println("Invalid input.");
				}
				break;
			default:
				System.out.println("Error");
			}
			System.out.println("Choose (r)ock, (p)aper, (s)cissors (q to quit): ");
			move = scan.nextLine();
			if (move.charAt(0) == 'q') {
				System.out.println("Wins: " + wins);
				System.out.println("Loses:" + loses);
				System.out.println("Ties: " + ties);
			}
		}
		scan.close();
	}
}
