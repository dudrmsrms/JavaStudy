package Ch07;

public class Triangle {
	float bottom;
	float height;

	// 넓이 구하기 메소드 (float)
	public float getArea() {
		return bottom * height / 2;

	}
//	 
//	 // 밑변 저장 set 메소드 (void)
//	 public void setBottom(float b) {
//		 bottom = b;
//	 }
//	 
//	 
//	 // 높이 저장 set 메소드 (void)
//	 public void setHeight(float h) {
//		 height = h;

	public float getBottom() {
		return bottom;
	}

	public void setBottom(float bottom) {
		this.bottom = bottom;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
}
