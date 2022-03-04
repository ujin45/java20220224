package chap05.book;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		
		System.out.println(strArray[0] == strArray[1]); // true
		System.out.println(strArray[0] == strArray[2]); // false
		System.out.println(strArray[0].contentEquals(strArray[2])); //true
	}
}