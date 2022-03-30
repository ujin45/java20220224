package chap15.book.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		
		// 객체 생성
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);  // 홍길동 key가 같아서 마지막에 저장된 값 대치
		System.out.println("총 Entry 수: " + map.size());  // 저장된 총 entry 수 얻기
		
		
		// 객체 찾기
		System.out.println("\t홍길동: " + map.get("홍길동"));  // key로 value 검색
		
		
		// 객체 하나씩 처리
		Set<String> keySet = map.keySet();    // KeySet 얻기
		Iterator<String>keyIterator = keySet.iterator();  
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ":" + value);
		}
		
		System.out.println();
		
		
		// 객체 삭제
		map.remove("홍길동");                // key로 Map.Entry 제거 
		System.out.println("총 Entry 수 : " + map.size());
		
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); 
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ":" + value);
		}
		
		System.out.println();
		
		
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
		
	}
}
