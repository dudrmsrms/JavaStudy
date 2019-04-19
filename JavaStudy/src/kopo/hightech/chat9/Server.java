package kopo.hightech.chat9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket ss;
	private Socket innerSocket;
	private BufferedReader br;
	private BufferedWriter bw;
	private PrintWriter pw;
	

	public void SeverStart() throws Exception {
		ss= new ServerSocket(22929);
		System.out.println("서버소켓이 생성되었습니다.");
		while(true) {
			System.out.println("클라이언트를 기다립니다.");
			innerSocket = ss.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			getMessage(innerSocket);
		}
	}
	public void getMessage(Socket innerSocket) throws Exception{
		// 입출력 스트림 만들기 변환하기 위한 3줄 31~34
//		InputStream is = innerSocket.getInputStream();
//		InputStreamReader isr = new InputStreamReader(is);
//		br = new BufferedReader(isr);
		// 1줄변환 입력 스트림 
		br = new BufferedReader(new InputStreamReader(innerSocket.getInputStream()));
		
		// bufferdwriter 는 전환이 필요하다 그러나 .
//		bw = new BufferedWriter(new OutputStreamWriter(innerSocket.getOutputStream()));
//		printWhiter 는 바로 전송이 가능하다
		pw = new PrintWriter(innerSocket.getOutputStream(),true);
		
		String temp=br.readLine();
		System.out.println("서버쪽에서 클라이언트로부터 받은 문자열 출력"+temp);
		
		if(br !=null) br.close();
		if(ss !=null) innerSocket.close();
		}

	public static void main(String[] args) throws Exception {
		Server se = new Server();
		se.SeverStart();

	}
}
