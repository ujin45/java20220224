package chap99.Leetcode;

import java.util.Arrays;

public class S1816 {

    public String truncateSentence(String s, int k) {
        
    	
//    	Input: s = "Hello how are you Contestant", k = 4
//      Output: "Hello how are you"
    	
    	
        String[] arr = s.split(" ");
        
        String[] res = Arrays.copyOf(arr,k);
        
        String str = String.join(" ", res);
          
        return str;
    }
}
