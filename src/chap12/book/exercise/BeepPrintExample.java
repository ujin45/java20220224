package chap12.book.exercise;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		
		// 각자 실행됨. 
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i=0; i<5; i++) {
			toolkit.beep();           // 비프음 발생
			
			try {
				Thread.sleep(500);    //  0.5초간 일시정지
			} catch (Exception e) {
				
			}
		}
		
		for (int i=0; i<5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);     //  0.5초간 일시정지
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
