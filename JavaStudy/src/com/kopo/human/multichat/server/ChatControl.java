package com.kopo.human.multichat.server;

import java.util.Vector;

public class ChatControl extends Vector<ChatThread>{
	
	public synchronized void addChatThread(ChatThread ct) {
		this.add(ct);		
	}
	// for 문 안의  this 가 가르키는 것은 Vector 이다 . 해깔릴 경우 그냥 Vector를 선언하여 사용한다.
	public synchronized void sendAllmessage(String msg){
		for(ChatThread ct: this){				
			ct.sendMessage(msg);
		}
	}
	
	//chatTread를 삭제 하는 기능 . 
	public synchronized void removeChatThread(ChatThread ct) {
		if(this.contains(ct)) {
			this.remove(ct);
		}
	}
	
	
	
	
	
	
	
	
	

}
