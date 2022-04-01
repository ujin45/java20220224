package chap15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class App05 {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int[] nums = {3,4,5,5,3};
		for (int num : nums) {
			
			map.put(num, map.getOrDefault(num, 0) + 1);
		
//			// if(map.containsKey(num)){
//			int val = map.get(num);
//			map.put(num, val+1);
//		} else {
//			map.put(num, 1);
		}
		
		System.out.println(map);
	}
	
}
