package chap15.lecture.p02set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class App02 {

	public static void main(String[] args) {
		
		
		// Lotto : 1~45의 임의이 값 6개 
		
		// 임의의 값 6개 중복 없이 출력하는 코드 작성
		
		Set<Integer> set = new HashSet<>();
		while (set.size() < 6) {
			int num = (int)(Math.random()*45+1);
			set.add(new Integer(num));
			
//			set.add((int)(Math.random()*45) +1); 한줄로 표현가능 
		}
		System.out.println(set);
		
		
		// 정렬하려면 Collection.sort(set); set은 정렬을 못함! List타입으로 변환
		List<Integer> list = new LinkedList<Integer>(set);
		System.out.println(list);
		Collections.sort(list);
		System.out.println("\nlotto : " +list);
	}
}
