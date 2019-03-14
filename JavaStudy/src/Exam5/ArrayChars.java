package Exam5;

public class ArrayChars {
	public static void main(String[] args) {
		char[] chars = { 'b', 'c', 'z', 'e', 'w' };
		//Arrays.sort(chars);   실제 정렬시 사용 
		
		char temp = ' ';
		
		for (int i = 0; i < chars.length - 1; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] > chars[j]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}

			}
		}
		System.out.println(chars);
	}
}
