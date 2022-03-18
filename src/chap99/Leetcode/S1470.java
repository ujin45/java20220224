package chap99.Leetcode;

public class S1470 {

	 public int[] shuffle(int[] nums, int n) {
	     
	     //input : nums = [2,5,1,3,4,7]  n = 3
		 //output : [2,3,5,4,1,7]
		 // <x1=2,x2=5, x3=1> , <y1=3,y2=4,y3=7>
		 
		 
		 int[] result = new int [n*2];
	        for(int i=0; i<n; i++){
	            result[2*i] = nums[i];
	            result[2*i+1] = nums[n+i];
	        }
	        return result; 
	    }
}
