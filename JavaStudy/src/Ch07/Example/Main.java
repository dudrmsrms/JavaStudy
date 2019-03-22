package Ch07.Example;

public class Main {
	public static void main(String[] args) {
		/* 헌혈자 정보 */
		Human human = new Human();
		human.setName("어떤거");
		human.setType('f');
		human.setAge(58);

		/* BloodHouse 객체 생성 */
		BloodHouse b1 = new BloodHouse();
		
		String result = ""; 
		
		result = b1.action(human);
		
		
		//action() 메소드 호출 결과 저장
		/* action() 메소드를 호출하면서 매개변수로 헌혈자 정보 넘겨줌 */
		/* action() 메소드 호출 결과 출력 */
		System.out.println(result);
	}
}