package chap18.lecture.p04writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App01 {
	public static void main(String[] args) throws Exception {
		
		// Writer : 문자 단위 출력 스트림
		
		String path ="output/WriterEx01.txt";
		Writer wr = new FileWriter(path);
		
		wr.write('a');
		wr.write('z');
		wr.write('한');
		wr.write('글');  // OS나 파일 형식의 따리 byte가 달라짐 
		wr.write("우크라이나");
		wr.write(new char[] {'자','바','스','프','링'});
		wr.write(8800);
		wr.write('\u2260');
		
		wr.close();
		
		System.out.println("프로그램 종료");
	}
}
