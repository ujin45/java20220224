package chap99.Leetcode;

public class S1528 {

    //input : s="codeleet", indices=[4,5,6,7,0,1,2,3]
	//output : "leetcode"
	
	public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        
        for(int i=0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        
        return new String(result);
    }
}
