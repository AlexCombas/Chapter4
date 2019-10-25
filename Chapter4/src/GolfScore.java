import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class GolfScore {

	public static void main(String[] args) throws IOException {
		Scanner golfFile = new Scanner(new File("golf.txt"));
		int par = 0, playerA=0, playerB=0, playerC=0, playerD=0;
		while (golfFile.hasNext()) {
			String next = golfFile.nextLine();
			Scanner line = new Scanner(next);
			par += line.nextInt();
			playerA += line.nextInt();
			playerB += line.nextInt();
			playerC += line.nextInt();
			playerD += line.nextInt();
		}
		System.out.println("Par:" + par 
				+ "\t\tA:" + playerA 
				+ "\tB:" + playerB 
				+ "\tC:" + playerC 
				+ "\tD:" + playerD);
		System.out.println("Over/Under:" 
				+ "\tA:" + (playerA - par) 
				+ "\tB:" + (playerB - par)
				+ "\tC:" + (playerC - par)
				+ "\tD:" + (playerD - par));
		golfFile.close();
	}

}
