package chap10.lecture.p04throw;

import java.io.FileReader;

public class App09 {

	public static void main(String[] args) throws Exception{
		method1();
	}
	
	private static void method1() throws Exception{
		FileReader fr = new FileReader("");  // FileNotFoundException
		fr.read(); //IOException
		
		Class.forName(""); //ClassNotFoundException
	}
}


    //치트기 : 모든 예외를 포함하고 있는 Exception을  많이 사용함!