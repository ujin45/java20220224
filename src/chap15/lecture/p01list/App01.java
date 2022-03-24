package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Collections;

public class App01 {

	public static void main(String[] args) {
		
		// List : 순서가 있고, 중복 저장 가능(여러개)
		// 구현 클래스 : ArrayList
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java");  //0번 인덱스
		list1.add("spring");//1번 인덱스
		list1.add("jsp");   //2번 인텍스
		
		String e1 = list1.get(0);
		String e2 = list1.get(1);
		String e3 = list1.get(2);
		
		System.out.println(e1); //java
		System.out.println(e2); //spring
		System.out.println(e3); //jsp
		
		// 길이를 리턴하는 메소드는 : size()
		int length = list1.size();
		System.out.println(length);
		
		// for loop로 탐색
		for (int i =0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		
		// 향상된 for 탐색
		for(String str : list1) {
			System.out.println(str);
		}
		
		System.out.println(list1.toString());
		
		
		ArrayList list2 = new ArrayList<>();
		list2.add("");
		list2.add("");
		list2.add("");
		Collections.copy(list2, list1);
		
		System.out.println(list2);
	}
}



