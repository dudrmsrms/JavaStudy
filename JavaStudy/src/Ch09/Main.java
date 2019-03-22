package Ch09;
//다형성 예제

public class Main {
	public static void drive (Car sc) {
		sc.move();
	}
	public static void main(String[] args) {
		Car c= new Car();
		SportsCar sc = new SportsCar();
		Truck t = new Truck();
		
		drive(t);
		drive(sc);
		drive(c);
		c.move();
		sc.move();
		sc.openSunloof();
//		
//다형성 이 자바에서 제일 중요한 개념이다.★		
		
//		
//		
//		Car car2 = sc; 
////		car2.openSunloof();
//		sc = car2;
		
				
	}	
	
}
