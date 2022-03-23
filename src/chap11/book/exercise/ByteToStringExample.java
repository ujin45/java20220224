package chap11.book.exercise;

public class ByteToStringExample {

	public static void main(String[] args) {
		
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);  // Hello java
		
		String str2 = new String(bytes, 6, 4);  //배열 6번 부터 4개 출력
		System.out.println(str2);  // java
	}
}
