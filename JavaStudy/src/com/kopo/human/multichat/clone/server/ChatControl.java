package com.kopo.human.multichat.clone.server;

import java.util.Vector;

public class ChatControl extends Vector<ChatThread> {

	public synchronized void addChatThread(ChatThread ct) {
		this.add(ct);
		// TODO Auto-generated method stub
		
	}
	// for ������ this �� ����Ű�°��� vector �̴� . �ر򸱰��  vector �� �����Ͽ� ����Ѵ�.
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
	
