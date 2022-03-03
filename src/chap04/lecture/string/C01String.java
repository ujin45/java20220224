package chap04.lecture.string;

public class C01String {
	public static void main(String[] args) {
		
		String str1 = "java";
		
		System.out.println(str1);
		System.out.println(str1.equals("spring"));  //false
		System.out.println(str1.equals("java"));    //true
		
		
		String sub1 = str1.substring(0,2);  // (0,2 : start : end) ja
		System.out.println(sub1);
		
		System.out.println(str1.substring(2,4)); //va
		System.out.println(str1.substring(2));   //(2 start) va
		
		System.out.println(str1.length()); // 4
	}
}
