package Ch07.printer;

public class Main {
	public static void main(String[] args) {
		Printer p = new Printer();
		Pc pc1 = new Pc();
		pc1.request();
		
		Pc pc2 = new Pc();
		pc2.request2(p);
	}

}
