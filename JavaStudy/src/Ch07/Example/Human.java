package Ch07.Example;
public class Human {
	char type;
	String name;
	int age;
//	generate setter and getter 를 사용하여 
	// 자동생성  ( sorrce - >generate setter and getter)  
	
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	}

//스캐너 활용 사용자들 데이터 가져옴.
	/* setter, getter 메소드 작성 */
