package chap03.lecture.unary;

public class C02Increment {
	public static void main(String[] args) {
		// 증감연산자
		// 증감   increment ++
		// 감소   decrement --
		
		int i = 7;
		
		i++;  // i = i + 1	
		System.out.println(i); // 8
		i++;
		System.out.println(i); // 9 
		i--;  // i = i - 1
		System.out.println(i); // 8
		i--;
		System.out.println(i); // 7
		

		// 증간연산자 위치 : 피연산자 앞/뒤 가능
		
		++i;
		System.out.println(i);    //8
		--i;
		System.out.println(i);    //7
		
		System.out.println(i++);  //7
		System.out.println(i);    //8
		System.out.println(i--);  //8
		System.out.println(i);    //7
		
		System.out.println(++i);  //8
		System.out.println(i);    //8
		System.out.println(--i);  //7
		System.out.println(i);    //7
		
		
		int j = i++;
		int k = ++i;
		
		System.out.println(j);    //7
		System.out.println(k);    //9
		
		int l = i;
		i++;         // int j = i++; 와 같다.
		
		i++;
		int m = i;   // int k = ++i; 와 같다.
		
		
		
	}
}
