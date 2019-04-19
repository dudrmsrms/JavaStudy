package kopo.hightech.chat9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;

public class Client2 {
	BufferedReader br;
	PrintWriter pw;
	Socket client2;
	
	public Client2() {
		connect();
	}
	public void connect() {
		try{
			client2 = new Socket("127.0.0.1",22929);
			br = new BufferedReader(new InputStreamReader(client2.getInputStream()));
			pw = new PrintWriter(client2.getOutputStream(),true);
			pw.println("³ª..¿À³ª?");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				if(client2!= null)client2.close();
				
			}catch (IOException ie) {
				
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Client2 cl = new Client2();
		
	}

}
