package chap03.book1;

public class BitLogicalExample {
	public static void main(String[] args) {
		
		System.out.println("45 & 25 = " + (45 & 25)); // 비트논리곱
		System.out.println("45 | 25 = " + (45 | 25)); // 비트논리합
		System.out.println("45 ^ 25 = " + (45 ^ 25)); // 비트배타적 논리합
		System.out.println("~45 = " + (~45));         // 비트논리부정
		                                              // 비트 연산자는 int 타입으로 변환하여 연산수행
		
	}
}
