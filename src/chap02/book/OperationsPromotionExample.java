package chap02.book;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byte byteValue1 + byte byteValue2;  // 컴파일 에러 
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1); // 10 + 20 = 30
		
		char charValue1 = 'A'; // 10진수로 65
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;   // 컴파일 에러
		
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);         // 유니코드 = 66 (A+1, 65+1)  
		System.out.println("출력문자 = " + (char)intValue2);   // 출력문자 = B  
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);  // 2 (10/4)
		
		int intValue5 = 10;
//		int intValue6 = 10 / 4.0  // 컴파일 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue); // 2.5 (10/4.0)
		
	}
}
