package Ch07;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageDownloader {
	int 전역변수; // 클래스 영역
	
	void method() {
			System.out.println(전역변수);
//			int 지역변수;
//			System.out.println(지역변수);
			
	}
	
	public static void main(String[] args) {

		// shift + Ctrl + O(알파벳) = > 한방에 임포트
		File outputFile = new File("c:/dev/test.jpg");
		
		

		URL url = null;
		BufferedImage bi = null;

		try {
			url = new URL(
					"http://www.bloter.net/wp-content/uploads/2019/03/190320_pr-tago-thumb-1-1140x460.jpg");
			bi = ImageIO.read(url);
			ImageIO.write(bi, "jpg", outputFile);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
	
	float 전역변수_실수; // 클래스 영역
	
	
}
