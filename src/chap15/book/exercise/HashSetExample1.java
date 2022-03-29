package chap15.book.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		
		// String 객체를 중복없이 저장하는 HashSet
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Java");
		set.add("iBATIS");      // Java는 한번만 저장됨.
		
		int size = set.size();  // 저장된 객체 수 얻기
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator();  // 반복자 얻기
		while (iterator.hasNext()) {     // 객체 수만큼 루핑
			String element = iterator.next();   // 한개의 객체를 가져옴
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");       // 한개의 객체 삭제
		set.remove("iBATIS");     // 한개의 객체 삭제
		
		System.out.println("총 객체수: " + set.size());  // 저장된 객체 수 얻기
		
		iterator = set.iterator();   // 반복자 얻기
		while (iterator.hasNext()) {             // 객체수만큼 루핑
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();   // 모든 객체를 제거하고 비움 
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
