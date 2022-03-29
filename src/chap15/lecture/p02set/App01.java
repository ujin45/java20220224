package chap15.lecture.p02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App01 {

	public static void main(String[] args) {
		
		// Set : 순서 없고 중복이 안 됨!
		// 구현 클래스 : HashSet 
		
		Set<String> set = new HashSet<>();
		
		// add : elemenet 추가
		set.add("jimin");
		set.add("suga");
		set.add("jin");
		set.add("rm");
		
		
		// size : 크기
		System.out.println(set.size());  // 4
		
		
		set.add("rm");
		System.out.println(set.size());  // 4  중복이 안되므로 여전히 4개 
		
		// 탐색
		// for문 사용 (향상된)
		for (String item : set) {
			System.out.println(item);  // 순서 보장이 안 됨! 순서 없음!
		}
		
		
		// Iterator
		Iterator<String>iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		// remove
		set.remove("rm");
		System.out.println(set.size());  // 3
		set.remove("winter");            // 없는 정보
		System.out.println(set.size());  // 3	
		
		
		// element 있는지?
		System.out.println(set.contains("rm"));  // false 
		System.out.println(set.contains("jin")); // true
		
	}
}
