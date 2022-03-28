package chap99.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class S1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> list = new ArrayList<>();
    
        for (int i=0; i<candies.length; i++){
           for (int j=0; j<candies.length; j++){
            
            if (candies[i] + extraCandies < candies[j]) {
                list.add(false);
                break;
            }
            
               if(j == candies.length -1) {
                 list.add(true);
             }   
           } 
        }
        return list;
    
//		int maxKid = 0;
//		for (int i : candies)
//			maxKid = Math.max(maxKid, i);
//
//		for (int candy : candies) {
//			int tmp = candy + extraCandies;
//
//			if (tmp >= maxKid)
//				list.add(true);
//			else
//				list.add(false);
//		}
//
//		return list;
    
        
        
          // 배열을 Array로 바꾸는 코드 
//        List<Integer> list = Arrays.stream(candies).boxed().collect(Collectors.toList());
//
//        Integer max = Integer.MIN_VALUE;
//        
//        for (int i =0; i<list.size(); i++){
//            max = Math.max (max, list.get(i));
//        }
//        
//        List<Boolean> result = new ArrayList<>();
//        
//        for (int i=0; i<list.size(); i++) {
//            result.add(list.get(i) + extraCandies >= max);
//        }
//        return result; 
    
    }
}
