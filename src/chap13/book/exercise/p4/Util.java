package chap13.book.exercise.p4;

public class Util {

	

	public static <T extends Pair<?, Integer>> Integer getValue(T pair, String string) {
		
		Object key = pair.getKey();
		
		if (key.equals(string)) {
			return pair.getValue();
		}
		
		return null;
	}	
}
