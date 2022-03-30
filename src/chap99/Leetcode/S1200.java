package chap99.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S1200 {

	public List<List<Integer>> minimumAbsDifference(int[] arr) {

		Arrays.sort(arr);  //정렬 먼저 해주고 
		
		int minDiff = Integer.MAX_VALUE;
		for (int i=0; i<arr.length-1; i++) {
			int diff = arr[i+1] - arr[i];
			minDiff = Math.min(minDiff, diff);			
		}
		
		List<List<Integer>> res = new ArrayList<>();
		
		for (int i = 0; i<arr.length-1; i++) {
			int diff = arr[i+1] - arr[i];
			if (minDiff == diff) {
				res.add(Arrays.asList(arr[i], arr[i+1]));
			}
		}
		return res;
	}
}  
