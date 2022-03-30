package chap99.codingbat;

import java.util.Map;

public class MapBully {
 
	public Map<String, String> mapBully(Map<String, String> map) {
		  
		  if(map.containsKey("a")) {
		        
		       String aval = map.get("a");
		       map.put("b",aval);
		       map.put("a", "");
		   }
		    return map; 
		  
		}

}
