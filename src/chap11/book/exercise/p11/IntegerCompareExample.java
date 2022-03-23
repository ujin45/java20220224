package chap11.book.exercise.p11;

public class IntegerCompareExample {

	public static void main(String[] args) {
		
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);  // true  
		System.out.println(obj3 == obj4);  // false
			
		// 의도한 대로 답이 나오지 않을 수 있어서 equals 메소드를 사용하도록 함!
		
	}
}
