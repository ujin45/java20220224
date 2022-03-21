package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App05 {

	public static void main(String[] args) {
	
		FileReader fr;
		try {
			fr = new FileReader("");
			fr.read();
//		} catch (FileNotFoundException e) {	
//			e.printStackTrace();  생략 가능함. 상속되어 있어서 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
