package RemoteConnection;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class Server {

	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(1500); // 0-1023 are reserved ports!!
			Socket s = ss.accept(); // The server listens to the client
			System.out.println("Connected!!");
			
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("Welcome to Sockets");
			
		}catch(Exception e) {}

	}

}
