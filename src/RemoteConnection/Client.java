package RemoteConnection;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket("127.0.0.1",1500);
		DataInputStream dis = new DataInputStream(s.getInputStream());
		String message = dis.readUTF();

//		Runtime.getRuntime().exec("cmd.exe /c start");
//      System.out.println("Command Prompt opened!!");
		
		ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", 
				"ping 127.10.10.1");
		builder.redirectErrorStream(true);
		Process p = builder.start();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		
		
		while(true) {
			line = br.readLine();
			if(line == null) {break;}
			System.out.println(line);
		}
	}

}
