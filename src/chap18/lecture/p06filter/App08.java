package chap18.lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class App08 {
	public static void main(String[] args) throws Exception{
		
		String out = "output/FilterExample8.txt";
		OutputStream os = new FileOutputStream(out);
		
		//OutputStreamWriter 로 변환
		//BufferedWriter 로 변환
		
		// 천만개의 문자 파일에 쓰는 코드 작성
		
		// 스트림 닫기 
		
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
			
		for (int i = 0; i < 10000000; i++) {
			bw.write('한');
		}		
	
		bw.close();
		osw.close();
		os.close();
	
		System.out.println("종료");
	}
		 
}
