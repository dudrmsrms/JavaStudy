package Ch07;

public class Triangle {
	float bottom;
	float height;

	// ���� ���ϱ� �޼ҵ� (float)
	public float getArea() {
		return bottom * height / 2;

	}
//	 
//	 // �غ� ���� set �޼ҵ� (void)
//	 public void setBottom(float b) {
//		 bottom = b;
//	 }
//	 
//	 
//	 // ���� ���� set �޼ҵ� (void)
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
