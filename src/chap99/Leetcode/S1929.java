package chap99.Leetcode;

public class S1929 {

	class Solution {

		public int[] getConcatenation(int[] nums) {
			
			// input: nums = [1,2,1]
			//output: [1,2,1,1,2,1]
			
			
			int[] result = new int[nums.length * 2];
			for (int i = 0; i < nums.length; i++) {
				result[i] = nums[i];
			}
			for (int i = 0; i < nums.length; i++) {
				result[i + nums.length] = nums[i];
			}
			return result;
		}
	}
}
