import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class NumberFile {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("numbers.txt"));
		while (scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
		scan.close();
	}

}
