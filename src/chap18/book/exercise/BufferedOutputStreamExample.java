package chap18.book.exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = null;
		FileOutputStream  fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		
		fis = new FileInputStream ("src/chap18/book/exercise/BufferedOutputStreamExample.java");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("picture/picture/참조타입05.png");
		start = System.currentTimeMillis();
		while ((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close(); bis.close(); fis.close();
		System.out.println("사용하지 않았을 때: " +(end - start) + "ms");
		
		
		fis = new FileInputStream ("src/chap18/book/exercise/BufferedOutputStreamExample.java");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("picture/picture/참조타입05.png");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while ((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close(); fos.close(); fis.close();
		System.out.println("사용했을 때 : " + (end - start) + "ms");
	
	}
}
