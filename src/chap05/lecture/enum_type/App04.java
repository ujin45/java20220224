package chap05.lecture.enum_type;

public class App04 {

	public static void main(String[] args) {
		
		// java.lang.Enum 클래스 상속 받아서 ordinal 메소드 
		
		Season s1 = Season.SPRING;
		Season s2 = Season.SUMMER;
		Season s3 = Season.FALL;
		Season s4 = Season.WINTER;
		
		s1.ordinal(); //자동 상속이 됨. 상수들의 번호를 나타냄.
		// ordinal 메소드
		System.out.println(s1.ordinal()); // 0
		System.out.println(s2.ordinal()); // 1
		System.out.println(s3.ordinal()); // 2
		System.out.println(s4.ordinal()); // 3
		
		
		// name 메소드
		// toString 메소드
		String str1 = s1.toString();
		System.out.println(str1);
		System.out.println(s2);
		
		
		// valueOf 메소드 (String -> enum 으로 변환)
		Season s5 = Season.valueOf("SUMMER");
		
		
		// values() : enum의 모든 상수를 배열로 리턴
		Season[] arr = Season.values();
		System.out.println(arr.length);  // 4
		System.out.println(arr[0]);  // SPRING
		
		for (Season season : arr) {
			System.out.println(season); // SPRING SUMMER FALL WINTER
			
		}			
	}
}
