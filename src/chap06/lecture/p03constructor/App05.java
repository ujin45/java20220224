package chap06.lecture.p03constructor;

public class App05 {
	public static void main(String[] args) {
		
		String s1 = new String();
		System.out.println(s1);
		
		String s2 = new String("java");
		System.out.println(s2); //java
		
		String s3 = new String(new char[] {'s','q','l'});
		System.out.println(s3);  // sql
		
		String s4 = new String(new byte[] {65,66,67});
		System.out.println(s4);  // 유니코드 ABC
		
		String s5 = new String(new char[] {'s','p','r','i','n','g'},2,4);
		System.out.println(s5);  // ring 2~4까지 
		
				
		
	}
}
