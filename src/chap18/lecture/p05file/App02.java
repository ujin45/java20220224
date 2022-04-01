package chap18.lecture.p05file;

import java.io.File;

public class App02 {
	public static void main(String[] args) {
		
		String path = "output/OutputStreamEx07.png";
		File file1 = new File(path);
		
		System.out.println(file1.exists());
		file1.delete();
		
		System.out.println(file1.exists());
		
		path = "output/other";
		File file2 = new File(path);
		
		file2.mkdir();  // 하나 폴더 만들기
		
		
		path = "output/other1/other2/other3";
		File file3 = new File(path);
		
		file3.mkdirs();  // 여러 폴더 만들기 
		
		
		
	}
}
