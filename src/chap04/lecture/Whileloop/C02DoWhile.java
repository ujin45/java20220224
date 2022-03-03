package chap04.lecture.Whileloop;

public class C02DoWhile {
	public static void main(String[] args) {

		System.out.println("stmt 1");
		do {
			System.out.println("stmt 2");
			System.out.println("stmt 3");
		} while (false); // stmt 1,2,3,4 do는 조건과 관계없이 실행됨.
		System.out.println("stmt 4");
	}
}
