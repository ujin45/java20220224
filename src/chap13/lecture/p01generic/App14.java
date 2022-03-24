package chap13.lecture.p01generic;

public class App14 {

	public static void main(String[] args) {
		
		App14.<String>method("java"); // 원래 코드 
		method("java"); // 보통 이렇게 사용 
		
		String s1 = App14.<String>method2();
		String s2 = method2();
		
		String s3 = App14.<String>method3("java");
		String s4 = method3("java");
		
		
	}
	// method에  type parameter을 리턴타입 전에  추가
	// generic method
	
	public static <T> void method (T param) {
		
		
	}
	
	public static <T> T method2() {
		
		return null;
	}
	
	public static <T> T method3(T param) {
		
		return null;
	}
}
