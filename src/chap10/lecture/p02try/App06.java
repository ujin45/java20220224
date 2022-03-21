package chap10.lecture.p02try;

public class App06 {

	public static void main(String[] args) {

		int[] arr1 = new int[] {1,0};

		try {
			int r = arr1[0] / arr1[2];
			System.out.println(r);

			// 캐치블럭 여러개 작성시 :상위타입을 먼저 작성하지 않도록 주의 . 
			// 작성하려면 마지막에 작성되면 괜찮음.

		
		} catch (RuntimeException e) {
			System.out.println("런타임익셉션 발생");
		}

		System.out.println("프로그램 실행 계속...");

	}

}
