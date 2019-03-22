package Ch07;

 //자료형의 목적
//방드시 변수가 존재
//그 변수의 값을 수정할수 있는 메소드가 존재

//Java Bean (POJO : Plain Old Java Object)
public class Notebook {
	int price;
	String brand;
	float size;
	
	
	public void pirnt() {
		System.out.println(price + brand + size);
	}
	
	//set 역할 메소드 / get 역할 메소드
	public void setSize(float size) {
		this.size = size;
		//중요 . this 의 활용법.
		//this. 변수 or 메소드  . () 는 생성자
	}
	public float getSize() {
		return size;
	}
	public void setBrand(String s ) {
		brand = s;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
}
