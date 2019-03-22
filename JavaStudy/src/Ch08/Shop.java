package Ch08;

public class Shop {
	String shopName;
	String telNum;
	boolean hasParking;
	// 기본 생성자 작성
	public Shop() {
		super();
	}
	public Shop(String shopName, String telNum, boolean hasParking) {
		super();
		this.shopName = shopName;
		this.telNum = telNum;
		this.hasParking = hasParking;
	}
	// 매개변수 3개 생성자 작성
	// shopName, telNum, hasParking 의 getter / setter 메소드 작성
	// 자동생성
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public boolean isHasParking() {
		return hasParking;
	}
	public void setHasParking(boolean hasParking) {
		this.hasParking = hasParking;
	}
}