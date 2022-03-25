package chap14.lecture.p01lambda;

import java.util.ArrayList;

public class App11 {

	public static void main(String[] args) {

		// removeIf 

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("java");
		list1.add("spring");
		list1.add("hello");
		list1.add("jsp");
		list1.add("friday");
		
		list1.removeIf((e) -> e.startsWith("j"));  // 만족하면 지워짐.
		System.out.println(list1.size());
		
		System.out.println(list1);
	}
}
