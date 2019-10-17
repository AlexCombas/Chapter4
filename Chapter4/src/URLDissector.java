import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class URLDissector {
	
	public static void main(String[] args) throws IOException
	{
		
		String url;
		Scanner fileScan, urlScan;
		
		fileScan = new Scanner(new File("websites.inp"));
		
		while (fileScan.hasNext())
		{
			url = fileScan.nextLine();
			System.out.println("URL: " + url);
			
			urlScan = new Scanner(url);
			urlScan.useDelimiter("/");
			
			while (urlScan.hasNext())
				System.out.println(" " + urlScan.next());
			System.out.println();
		}
		fileScan.close();
	}
}
