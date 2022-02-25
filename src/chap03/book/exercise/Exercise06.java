package chap03.book.exercise;

public class Exercise06 {
	public static void main(String[] args) {
		// 사다리꼴의 넓이를 구하는 코드
		// 소수자릿수가 나올 수 있도록 작성
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = 7*(lengthTop + lengthBottom)/2;
		double area2 = (lengthTop + lengthBottom) * height/2.0;
		
		
		System.out.println(area);  // 52.0
		System.out.println(area2); // 52.5
	}
}
