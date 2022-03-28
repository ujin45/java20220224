package chap12.lecture.p01thread;

import java.awt.Toolkit;

public class App05 {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		// 소리가 5번 실행 됨. 
		for (int i=0; i < 5; i++) {
			toolkit.beep();

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 띠링이 5번 출력됨. 
		for (int i=0; i < 5; i++) {
			System.out.println("띠링");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


