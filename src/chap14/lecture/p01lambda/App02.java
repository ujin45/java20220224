package chap14.lecture.p01lambda;

public class App02 {

	public static void main(String[] args) {
		
		// 람다식 : (->)사용 
		// 추상 메소드 2개 이상일때는 사용 못함! (X)
		
		MyInterface2 o1 = (int a, int b)-> {
			
				System.out.println(a);
				System.out.println(b);
		};
		
		MyInterface2 o2 = new MyInterface2() {
			@Override
			public void method1(int x, int y) {
				System.out.println(x);
				System.out.println(y);
			}
		};
	}
}

interface MyInterface2 {
	void method1(int a, int b);
	
	
}
