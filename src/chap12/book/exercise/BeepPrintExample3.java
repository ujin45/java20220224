package chap12.book.exercise;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		
		// 메인 스레드와 작업 스레드가 동시에 실행 
		
		Thread thread = new BeepThread();
		thread.start();
		
		
		for (int i=0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
