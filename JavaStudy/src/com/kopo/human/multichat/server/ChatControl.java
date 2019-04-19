package com.kopo.human.multichat.server;

import java.util.Vector;

public class ChatControl extends Vector<ChatThread>{
	
	public synchronized void addChatThread(ChatThread ct) {
		this.add(ct);		
	}
	// for �� ����  this �� ����Ű�� ���� Vector �̴� . �ر� ��� �׳� Vector�� �����Ͽ� ����Ѵ�.
	public synchronized void sendAllmessage(String msg){
		for(ChatThread ct: this){				
			ct.sendMessage(msg);
		}
	}
	
	//chatTread�� ���� �ϴ� ��� . 
	public synchronized void removeChatThread(ChatThread ct) {
		if(this.contains(ct)) {
			this.remove(ct);
		}
	}
	
	
	
	
	
	
	
	
	

}
