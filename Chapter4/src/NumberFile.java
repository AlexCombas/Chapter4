import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class NumberFile {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("numbers.txt"));
		int count = 0;
		int numbers = 0;
		while (scan.hasNext()) {
			String s = String.valueOf(scan.nextLong());
			count += s.length();
			numbers++;
		}
		System.out.println("Total individual integers: " + count);
		System.out.println("Total multidigit numbers: " + numbers);
		scan.close();
	}

}
