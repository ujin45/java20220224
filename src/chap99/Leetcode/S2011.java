package chap99.Leetcode;

public class S2011 {
	 
	public int finalValueAfterOperations(String[] operations) {
			
			// input : operations = ["--X","X++","++X"] ["++X","++X","X++"]
			// output : 1 , 3 
			int val = 0;
	        for(String op : operations) {
	            if(op.equals("++X") || op.equals("X++")) {
	                val++;
	            } else{
	                val--;
	            }
	        }
	        return val;
	      
	    }
}
