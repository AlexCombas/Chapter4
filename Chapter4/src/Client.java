import java.io.*;
import java.net.*;
public class Client {
	public static void main(String[] args) {
		
		
		try {
			Socket s = new Socket("127.0.0.1", 1223);
			
			DataInputStream in = new DataInputStream(s.getInputStream());
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			
			String msgIn = "", msgOut = "";
			
			while (!msgIn.equals("out")) {
				msgOut = rd.readLine();
				out.writeUTF(msgOut);
				
				msgIn = in.readUTF();
				System.out.println(msgIn);
			}
			s.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
