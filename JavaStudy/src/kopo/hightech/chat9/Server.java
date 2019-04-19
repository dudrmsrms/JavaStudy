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
		System.out.println("���������� �����Ǿ����ϴ�.");
		while(true) {
			System.out.println("Ŭ���̾�Ʈ�� ��ٸ��ϴ�.");
			innerSocket = ss.accept();
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
			getMessage(innerSocket);
		}
	}
	public void getMessage(Socket innerSocket) throws Exception{
		// ����� ��Ʈ�� ����� ��ȯ�ϱ� ���� 3�� 31~34
//		InputStream is = innerSocket.getInputStream();
//		InputStreamReader isr = new InputStreamReader(is);
//		br = new BufferedReader(isr);
		// 1�ٺ�ȯ �Է� ��Ʈ�� 
		br = new BufferedReader(new InputStreamReader(innerSocket.getInputStream()));
		
		// bufferdwriter �� ��ȯ�� �ʿ��ϴ� �׷��� .
//		bw = new BufferedWriter(new OutputStreamWriter(innerSocket.getOutputStream()));
//		printWhiter �� �ٷ� ������ �����ϴ�
		pw = new PrintWriter(innerSocket.getOutputStream(),true);
		
		String temp=br.readLine();
		System.out.println("�����ʿ��� Ŭ���̾�Ʈ�κ��� ���� ���ڿ� ���"+temp);
		
		if(br !=null) br.close();
		if(ss !=null) innerSocket.close();
		}

	public static void main(String[] args) throws Exception {
		Server se = new Server();
		se.SeverStart();

	}
}
