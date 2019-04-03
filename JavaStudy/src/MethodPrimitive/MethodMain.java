package MethodPrimitive;

public class MethodMain {
	
	public static void main(String[] args) {
		Send se = new Send(10);
		se.send();
		Mp3 m = new Mp3();
		se.sendObject(m);
		System.out.println(m.i);
		System.out.println(m.i);
//		se.sendObject(new Mp3());
//		se.sendObject(new Mp3());
		
	}
	
}
