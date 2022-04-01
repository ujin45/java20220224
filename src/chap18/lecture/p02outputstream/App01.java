package chap18.lecture.p02outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
	public static void main(String[] args) {
		
		// outputStream : byte단위 출력할 때 사용하는 클래스
		
		String fileName = "output/OutputStreamEx01.txt";
		
		try (OutputStream os = new FileOutputStream(fileName);){ 
			
			os.write(99);       // 1byte만 씀
			os.write(999999);   // 1byte만 씀
			os.write(98798344); // 1byte만 씀    총 3byte임.
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
//		os.close();
		
		System.out.println("프로그램 종료...");
	}
}
