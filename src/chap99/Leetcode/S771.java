package chap99.Leetcode;

import java.util.HashSet;
import java.util.Set;

public class S771 {

    
	// input : jewels = "aA", stones = "aAAbbb"
	// output : 3  쥬얼리의 문자가 스톤의 몇개 있는지 
	
	public int numJewelsInStones(String jewels, String stones) {
        
        int cnt = 0;
        for(int i =0; i < jewels.length(); i++) {
            for(int j=0; j<stones.length(); j++) {
                if(jewels.charAt(i) == stones.charAt(j)) {
                    cnt++;
                }
            }
        }
        return cnt;
    } 
}


class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
       Set<Character> set = new HashSet<>();
        
        for (char c  : jewels.toCharArray()) {
             set.add(c);
        }
        
        int cnt = 0;
        
        for (char c: stones. toCharArray()) {
            if(set.contains(c)){
                cnt++;
            }
        }
        return cnt;
    } 
}