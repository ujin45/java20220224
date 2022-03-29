package chap99.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class S118 {

	public List<List<Integer>> generate(int numRows) {
		
		 List<List<Integer>> result = new ArrayList<>();
		 List<Integer> first = new ArrayList<>();
	        
		 	first.add(1);
		 	
		 	result.add(first);
	        
	        // 일 잘 하고 
	        while (result.size() < numRows) {
	        	List<Integer> lastRow = result.get(result.size() -1);
	        	List<Integer> nextRow = nextRow(lastRow);
	        	 
	        }
	        
	        return result;
		
		
	}
	    private List<Integer> nextRow(List<Integer> cur) {
	        List<Integer> next = new ArrayList<>();
	        
	        next.add(1);
	        
	        // 더하는 일
	        for (int i = 0; i < cur.size()-1; i++) {
	            Integer sum = cur.get(i) + cur.get(i+1);
	            next.add(sum);
	        }
	        
	        next.add(1);
	        
	        return next;
		
		
	    }
}
	
