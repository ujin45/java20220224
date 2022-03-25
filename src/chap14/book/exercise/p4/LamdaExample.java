package chap14.book.exercise.p4;

import java.util.function.IntSupplier;

public class LamdaExample {

	public static int method(int x, int y) {
		IntSupplier supplier = () -> {
//			int x *= 10;
//			int result = x + y;
			//람다식 안에 선언된 매개변수와 로컬 변수는 final 특성을 가지고 있어서 데이터 변경이 불가능함. 
			int x1 = x * 10;
			int result = x1 + y;
			
				return result;
		};
		
		int result = supplier.getAsInt();
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println(method(3,5));
	}
}
