package chap15.lecture.p03map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App03 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list = Arrays.asList("a","b","c");
		
		String result = "";
		list.forEach(e -> result += e);
		
//		지역 변수 result의 값을 람다식에서 변경하였다. 람다에서 사용하는 지역 변수 result는 변경할 수 없다. 
//		result가 final이어야 한다. 또는 effectively final 이어야한다. 
//		Local variable result defined in an enclosing scope must be final or effectively final
		
		System.out.println();
	}
}
