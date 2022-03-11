package chap06.book.s060804;

public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
		// 정사각형의 넓이 구하기
		double result1 = myCalc.areaRectangle(10);
		
		// 직사각형의 넓이 구하기
		double result2 = myCalc.areaRectangle(10, 20);
		
		// 결과 출력
		System.out.println("정사각형의 넓이 = " + result1);
		System.out.println("직사격형의 넓이 = " + result2);
		
	}
}
