package chap99.codingbat;

public class Array2 {
	
		
		
		public int sum13(int[] nums) {
			  int sum = 0;
			  
			  for (int i=0; i < nums.length; i++) {
			   
			    if (nums[i] != 13) {
			      sum += nums[i];
			    } else if (nums[i] == 13 && i < nums.length-1 ) {
			      nums[i] = 0;
			      nums[i+1] = 0;
			    }
			     
			  }
			    return sum;
			}
		
		
		
		public int centeredAverage(int[] nums) {
			   int sum = 0;
			   int max = nums[0];
			   int min = nums[0];
			  
			   for (int i=0; i < nums.length; i++) {
			    sum += nums[i];
			    max = (max < nums[i]) ? nums[i] : max;
			    min = (min > nums[i]) ? nums[i] : min;
			     
			  }
			  
			  sum -= max;
			  sum -= min;
			  
			  return sum / (nums.length -2);
			}

		
		
		public int bigDiff2 (int[] nums) {
			  int max = nums[0];
			  int min = nums[0];
			  
			  for (int i=0; i< nums.length; i++) {
			   
			        max = Math.max(max,nums[i]); 
			        min = Math.min(min,nums[i]);
			     
			    }
			    return max - min;
			  }
		
		
		public int bigDiff(int[] nums) {
			  int max = nums[0];
			  int min = nums[0];
			  
			  for (int i=0; i< nums.length; i++) {
			   
			    if (max < nums[i]) {
			    	max = nums[i];
			    } 
			     
			    if (min > nums[i]) {
			    	min = nums[i];
			    }
			   }
			    return max - min;
		}


		
		
		public int countEvens(int[] nums) {
			  int cnt = 0;
			  
			  for (int i = 0; i < nums.length; i++) {
			    
			     if ((nums[i] % 2) == 0) {
			         cnt++;     
			    }
			       
			  }
			      return cnt;
			}

	}

