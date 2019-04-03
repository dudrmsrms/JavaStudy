package MethodPrimitive;

public class Send {
	int send;
	public Send(int send) {
		this.send=send;
		// TODO Auto-generated constructor stub
	}
	public void send() {
		Receive re = new Receive();
		int result = re.receive(send);
		System.out.println(result);
	}
	public void sendObject(Elec elec){
		elec.volumeDown();
		elec.volumeUp();
	}
	public void sendObject(Mp3 m) {
		
		m.i= 28;
		
	}
	

}
