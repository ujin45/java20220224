package chap15.lecture.p02set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class App03 {

	@Test
	public void test() {
		assertTrue(solution(new int[] {1,2,3,3,4,5}));
		assertFalse(solution(new int[] {99,88,77,66,55}));
		assertFalse(solution(new int[] {}));
		assertTrue(solution(new int[] {1,1}));
		
// Assert : 개발테스트 단계에서 파라미터가 제대로 넘어왔는지 계산이 제대로 됐는지 혹은 메소드가 작동하는
		//  한계상황(Null이 들어오면 작동안함)을 정하는 용도 
		
		
	}
	
	public boolean solution(int[] nums) {
		
		// nums가 중복된 값을 가지고 있으면 true, 아니면 false
		Set<Integer> set = new HashSet<>();
		
		for (int num : nums) {
			set.add(num);
		}
		return nums.length != set.size();
	}
}

