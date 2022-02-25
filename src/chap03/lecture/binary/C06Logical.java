package chap03.lecture.binary;

public class C06Logical {
	public static void main(String[] args) {
		// 논리 연산자
		// &&(AND short circuit), ||(OR short circuit)
		// &(AND), |(OR), ^(XOR)
		// 피연산자 : boolean
		// 연산 결과 : boolean
		
		// AND &&
		// 결과가 양변 모두 true일 때만 true, 나머지 모두 false
		System.out.println(true && true);  // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		// OR ||
		// 결과가 양변 모두 false일때만 false, 나머지는 true
		System.out.println("OR ||");
		System.out.println(true || true);  // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		// short circuit
		int i =3;
		System.out.println((i > 0) && (i++ > 0)); // true
		System.out.println(i);
		
		System.out.println((i < 0) && (i++ < 0));  // false 단락(short circuit)  
		System.out.println(i); 
		
		System.out.println((i < 0) || (i++ < 0));  //
		System.out.println(i);
		
		System.out.println((i > 0) || (i++ > 0)); // short circuit
		System.out.println(i);
		
		
		
		// & 하나는 잘 사용하지 않음 
		System.out.println((i > 0) & (i++ > 0)); // true
		System.out.println(i);
		
		System.out.println((i < 0) & (i++ < 0)); // short circuit xxxxxxx
		System.out.println(i);
		
		
		// ^ (XOR)
		// 양변이 다를때에만 true, 같으면 false
		System.out.println(true ^ true); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(false ^ false); // false
		
		
	}
}
