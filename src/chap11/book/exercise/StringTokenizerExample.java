package chap11.book.exercise;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String text = "홍길동/이수홍/박연수";
		
		// How1 : 전체 토큰 수를 얻어 For문으로 루핑 . 문자열을 분리하는 방법
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		// How2 : 남아 있는 토큰을 확인하고 While 문으로 루핑
		st = new StringTokenizer(text,"/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
	
}
