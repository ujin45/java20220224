package chap99.Leetcode;

public class S1512 {

    public int numIdenticalPairs(int[] nums) {
        
    	
    	//input : nums = [1,2,3,1,1,3]-4번 ,  [1,1,1,1]-6번 , [1,2,3]-0번
    	//output : 같은 숫자끼리 조합이 몇 번 가능한지.
    	
        int count = 0;
        int n = nums.length;
        
        for(int i=0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
		return count;
    }
}
