package chap99.Leetcode;

public class S1662 {

	//input : word1 = ["ab", "c"], word2 = ["a", "bc"]
	//        word1 =["abc","d","defg"] , word2=["abcddefg"]                 
	//output : true 각 값의 연결 값이 같으면 true
	
	   public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	       
		   String str1 = ""; 
	        String str2 = "";
	        
	        //향상된 for문
	        for(String s : word1) {
	            str1 += s;
	        }
	        for(String s : word2) {
	            str2 += s;
	        }
	        return str1.equals(str2);
	    }
}
