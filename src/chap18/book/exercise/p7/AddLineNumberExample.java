package chap18.book.exercise.p7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		
		//정확한 경로로 수정하세요
		
		String filePath = "src/chap18/book/exercise/p7/AddLineNumberExample.java";
		Reader rd = new FileReader(filePath);
		BufferedReader br = new BufferedReader(rd);
		
		
		String line = "";
		
		int lineNumber = 1;
		while ((line = br.readLine()) != null) {
			System.out.println(lineNumber + ": " + line);
			lineNumber++;
		}
		
		br.close();
		rd.close();
		
	}
}
