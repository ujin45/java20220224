package chap11.book.exercise;

public class StringSubstringExample {

	public static void main(String[] args) {
		
		String ssn = "880815-1234567";
		 
		String firstNum = ssn.substring(0,6); // 0부터 6전까지 (0~5)
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);  // 7부터 끝까지
		System.out.println(secondNum);
	}
}
