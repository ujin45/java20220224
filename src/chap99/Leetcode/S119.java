package chap99.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class S119 {

	public List<Integer> getRow(int rowIndex) {
 

        List<Integer> result = new ArrayList<>();
        result.add(1);
        
        // 일 잘 하고 
        for (int i = 0; i < rowIndex; i++) {
            result = nextRow(result);
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
		
		
		
//		List<Integer> result = new ArrayList<Integer>();
//		
//		int i;
//		result.add(1);
//		
//		if (rowIndex == 0) {
//			return result;
//		}
//		for (i=0; i<rowIndex; i++) {
//			result.add((int)(long) result.get(i-1) * (rowIndex - i + 1) / i);
//			
//			result.add(1);
//		}
//		return result;
	}
}
