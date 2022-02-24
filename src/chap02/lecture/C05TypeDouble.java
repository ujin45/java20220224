package chap02.lecture;

public class C05TypeDouble {
	public static void main(String[] args) {
		
		// 실수 float(4), double(8)- 정교하게 표현할 수 있다
		
		double var1 = 3.14;
		System.out.println(var1);
		
//		float var2 = 3.14; // 실수 literal은 double 타입
		float var3 = 3.14F; // 실수 끝에 F(f) 사용
		
		double var4 = 5E3;  //5*10^3
		double var5 = 5e3; // 5*10^3
		double var6 = 5e-3;  // 5*10^-3
		
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
 		
		
	}
}
