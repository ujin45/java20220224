package chap04.lecture.switchcase;

public class C01Switch {
	public static void main(String[] args) {
		
		System.out.println("stmt 1");
		switch (2) { // 스위치문 부터 나타남. 2 다음부터 1,3,4,5
		case 1:
			System.out.println("stmt 2");
		case 2:
			System.out.println("stmt 3");
		case 3:
			System.out.println("stmt 4");
		}
		
		System.out.println("stmt 5");
	}
}
