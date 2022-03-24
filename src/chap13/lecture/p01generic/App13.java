package chap13.lecture.p01generic;

import java.util.ArrayList;
import java.util.List;

public class App13 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		List<Object> list2 = new ArrayList<Object>();
		
		list1.add("java");
		list2.add(new Object());
		
//		List<Object> list3 = list1;  // X
		// 된다면...
//		list3.add(new Object()); 
	}
}


