package chap03.book.exercise;

public class Exercise05 {
	public static void main(String[] args) {
		
		// 십의 자리 이하를 버리는 코드 
		// 356 을 300 으로 나올 수 있도록 산술연산자만 사용하여 작성
		int value = 356;
		System.out.println(value/100*100);
		System.out.println(value - (value % 100));
		
	
		
	}
}
