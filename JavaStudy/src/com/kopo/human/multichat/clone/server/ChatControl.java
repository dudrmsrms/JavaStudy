package com.kopo.human.multichat.clone.server;

import java.util.Vector;

public class ChatControl extends Vector<ChatThread> {

	public synchronized void addChatThread(ChatThread ct) {
		this.add(ct);
		// TODO Auto-generated method stub
		
	}
	// for 문안의 this 가 가르키는것은 vector 이다 . 해깔릴경우  vector 를 선언하여 사용한다.
	public synchronized void sendAllmessage(String msg) {
		for(ChatThread ct : this) {
			ct.sendMessage(msg);
		}
	}

	public synchronized void removeChatThread(ChatThread ct) {
		// TODO Auto-generated method stub
		if(this.contains(ct)) {
			this.remove(ct);
		}
	}
}
	
