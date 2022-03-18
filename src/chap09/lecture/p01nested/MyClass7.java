package chap09.lecture.p01nested;

public class MyClass7 {

	void method1(int param) {
		
		// Local class에서 지역변수(파라미터) 사용시 주의할 점
		// 지역변수 (파라미터)는 final 이어야함 사용 가능
		// 단, 값이 변경되지 않으면 생략 가능(effectively final)
		
		final int i =3;  // final명 생략 가능 
		
		class LocalClass1 {
			void method2() {
				System.out.println(i);
			}
			
			void method4() {
				System.out.println(param);
//				param = 4;
			}
		}
	}
}
