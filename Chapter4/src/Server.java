import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(1223);
			Socket s = ss.accept();

			DataInputStream in = new DataInputStream(s.getInputStream());
			DataOutputStream out = new DataOutputStream(s.getOutputStream());

			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

			String msgIn = "", msgOut = "";

			while (!msgIn.equals("end")) {
				msgIn = in.readUTF();
				System.out.println(msgIn);

				msgOut = rd.readLine();
				out.writeUTF(msgOut);
				out.flush();
			}
			s.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
