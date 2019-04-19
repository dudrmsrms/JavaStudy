package com.kopo.human.multichat.clone.server;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerMain {
	Socket socket;
	ServerSocket serverSocket;
	static ChatControl cct = new ChatControl();
	public void starServer() {
		try {
			serverSocket = new ServerSocket();
			while(true) {
				socket = serverSocket.accept();
				ChatThread ct = new ChatThread(socket);
				cct.addChatThread(ct);
				ct.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ChatServerMain csm = new ChatServerMain();
		csm.starServer();
	}
}
