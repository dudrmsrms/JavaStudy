package quest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Number n = new Number();
		int number = n.get();

		int baseball3 = number % 10;
		int baseball2 = (number / 10) % 10;
		int baseball1 = (number / 10 / 10) % 10;
// 반드시 띄워쓰기 통해서 넣어야만  nextInt 안에 들어간다.
		for (int i = 1; i <= 5; i++) {
			System.out.println("게임을 시작합니다 중복되지 않은 숫자 3번을 띄워서 입력후 엔터 치시오.");
			Scanner s = new Scanner(System.in);
			int inputNumber1 = s.nextInt();
			int inputNumber2 = s.nextInt();
			int inputNumber3 = s.nextInt();

			int strike = 0; // 스트라이크를 개수를 저장할 변수
			int ball = 0; // 볼의 개수를 저장할 변수
			int out = 0;

			
			if (baseball1 == inputNumber1) {
				strike = strike + 1;
			} else if (baseball1 == inputNumber2 ||baseball1 == inputNumber3) {
				ball = ball + 1;
			} else  {
				out = out + 1;
			}
			System.out.println("1행값 = " + strike + " " + ball+" "+out);
			if (baseball2 == inputNumber2) {
				strike = strike + 1;
			} else if (baseball2 == inputNumber1 ||baseball2 == inputNumber3) {
				ball = ball + 1;
			} else  {
				out = out + 1;
			}
			System.out.println("2행값 = " + strike + " " + ball+" "+out);
			if (baseball3 == inputNumber3) {
				strike = strike + 1;
			} else if (baseball3 == inputNumber2 ||baseball3 == inputNumber1) {
				ball = ball + 1;
			} else  {
				out = out + 1;
			}
			System.out.println("3행값 = " + strike + " " + ball+" "+out);

			/*
			 * 코드 작성 스트라이크와 볼 검사 조건문 작성
			 */

			System.out.println("스트라이크 => " + strike);
			System.out.println("볼 => " + ball);
			System.out.println("아웃 =>" + out);
		}
	}
}

class Number {
	public int get() {
		int number = 0;
		try {
			URL url = new URL("http://ggoreb.com/kopo/baseball.txt");
			URLConnection urlConnection = url.openConnection();
			InputStream in = urlConnection.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			StringBuffer response = new StringBuffer();
			String data = null;
			while ((data = reader.readLine()) != null) {
				response.append(data);
			}
			number = Integer.parseInt(response.toString());
			reader.close();
			isr.close();
			in.close();
		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
		return number;
	}
}