package chap99.Leetcode;

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
