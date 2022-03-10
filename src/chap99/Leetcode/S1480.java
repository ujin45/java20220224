package chap99.Leetcode;

public class S1480 {
	class Solution {
		
		
		public int[] runningSum(int[] nums) {
		
			// Input : nums = [1,2,3,4]
			// Output : [1,3,6,10]
			// [1,1+2,1+2+3,1+2+3+4]
			
			int[] result = new int[nums.length];
			int sum = 0;

			for (int i = 0; i < nums.length; i++) {
				if (i == 0) {
					result[i] = nums[i];
				} else {
					result[i] = result[i - 1] + nums[i];
				}

			}
			return result;
			 
//			int[] result = new int[nums.length];
//			int sum = 0;
//			 
//		        for(int i=0; i<nums.length; i++) {
//		            sum +=  nums[i];
//		            result[i] = sum;
//		        }
//		 
//		        return result;
//			
		}
	}
}
