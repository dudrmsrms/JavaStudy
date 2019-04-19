package com.kopo.human;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class StreamTest {
	int temp;
	int block;
	String tempStr;
	public void test() {
		try {
			FileInputStream fs = new FileInputStream("d:/a.txt");
			// filereader fs = new filereader("d:/a.txt");
			long before = System.currentTimeMillis();
			while ((temp = fs.read()) != -1) {
				System.out.print((char) temp);
			}
			System.out.println();
			long amount = System.currentTimeMillis() - before;
			System.out.println("FileInputStream 사용 while 문에 걸리는 시간" + amount);
			fs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//2.filereader 사용
	public void test1() {
		
		try {
			FileReader fr = new FileReader("d:/a.txt");
			FileWriter fw = new FileWriter("d:/test1.txt");
			long before = System.currentTimeMillis();
			while((block=fr.read())!=-1){
				fw.write(block);
			}
			long amount = System.currentTimeMillis()-before;
			System.out.println(
				"복사시간(Reader,Writer) while문이 걸린시간: "+amount);
			fr.close();
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	//bufferdReader / Bufferwriter 사용 한 예제 클래스 .
	public void test2() {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("d:a.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("d:test44.txt"));
			while((tempStr=br.readLine())!=null) {
				System.out.println(tempStr);
				bw.write(tempStr+"\r\n");
			}
			br.close();
			bw.close();
			
					
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		StreamTest ts = new StreamTest();
//		ts.test();
//		ts.test1();
		ts.test2();
//		ts.test3();
	}
}
