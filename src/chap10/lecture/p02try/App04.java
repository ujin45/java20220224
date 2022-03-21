package chap10.lecture.p02try;

public class App04 {
	public static void main(String[] args) {
		
		
		int[] arr1 = new int[] {3,0};

		try {
			int r = arr1[0] / arr1[2];
			System.out.println(r);
			//캐치블럭 하나씩 실행되고 맞는 캐치 하나에서만 실행됨.
		} catch (NullPointerException e){
			System.out.println("널포인터익셉션 발생");
		} catch (ArithmeticException e) {
			System.out.println("아리스메틱익셉션 발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("어레이인덱스아웃오브바운즈익셉션 발생");
		}
		
		System.out.println("프로그램 실행 계속...");
				
		
		
	}
}
