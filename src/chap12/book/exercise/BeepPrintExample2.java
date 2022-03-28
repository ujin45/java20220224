package chap12.book.exercise;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		// 메인 스레드와 작업 스레드가 동시에 실행
		
		
		// Runnable 익명 객체 이용
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i=0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
	
					}
				}
			}
		});
		
		
		// 람다식 이용
		Thread thread3 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i=0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (Exception e) {

				}
			}
		});
		
		
		Runnable beepTask = new BeepTask();
		Thread thread2 = new Thread(beepTask);
		thread2.start();   // BeepRunnable 
		
		for (int i=0; i<5; i++) {
			System.out.println("땅");
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
	
}
