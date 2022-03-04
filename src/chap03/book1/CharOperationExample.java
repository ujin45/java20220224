package chap03.book1;

public class CharOperationExample {
	public static void main(String[] args) {
		
		char c1 = 'A' + 1;  // 리터럴이라는 A문자의 1을 더한 값 65+1=66
		char c2 = 'A';      // 65라는 유니코드 
//		char c3 = c2 + 1;   // 컴파일 에러 // 
		char c3 = (char) (c2 + 1);
		
		System.out.println("c1: " + c1);  // B
		System.out.println("c2: " + c2);  // A
		System.out.println("c3: " + c3);  // B
		
	}
}
