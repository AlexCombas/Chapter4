
public class Askey {

	public static void main(String[] args) {
		int count =0;
		for (char c=32; c<127; c++) {
			System.out.print(c + " : " + (int) c + "\t\t");
			count++;
			if (count % 5 == 0) {
				System.out.println();
			}
			
		}
	}
}
