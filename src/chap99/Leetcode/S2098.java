package chap99.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S2098 {

    public List<Integer> targetIndices(int[] nums, int target) {
        
    	Arrays.sort(nums);
        
        List<Integer> result = new ArrayList<>();
        
        for (int i=0; i<nums.length; i++) {
        	if (nums[i] == target) {
        		result.add(i);
        	}
        	if (nums[i] > target) {
        		break;
        	}
        }
        
        return result;
        
    }
}
