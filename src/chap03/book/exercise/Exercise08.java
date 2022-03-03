package chap03.book.exercise;

public class Exercise08 {
	public static void main(String[] args) {
		
		// % 연산을 수행한 결과값에 10을 더하는 코드 
		// NaN 값을 검사해서 올바른 결과가 출력되도록 작성
		
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if(true) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}
	}
}
