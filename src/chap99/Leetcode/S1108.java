package chap99.Leetcode;

public class S1108 {
   
	// input : address = "1.1.1.1"
	// output : "1[.]1[.]1[.]1[.]" 
	
	public String defangIPaddr(String address) {
        
        
        String result ="";
        for(int i =0; i<address.length(); i++) {
            if(address.charAt(i) == '.') {
                result += "[.]";
                
            }else {
                result += address.charAt(i);
            }
        }
        return result;
    }
}
 
     // charAt() :
     // String으로 저장된 문자열 중에서 한 글자만 선택해서 
     // Char타입으로 변환해주는 것.

 