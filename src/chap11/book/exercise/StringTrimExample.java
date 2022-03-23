package chap11.book.exercise;

public class StringTrimExample {

	public static void main(String[] args) {
		
		// trim() : 문자열 앞 뒤 공백 제거한 새로운 문자열 생성하여 리턴.
		
		String tel1 = "  02";
		String tel2 = "123    ";
		String tel3 = "     1234";
		
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}
}
