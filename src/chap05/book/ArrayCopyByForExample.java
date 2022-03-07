package chap05.book;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5]; // length의 길이
		
		for(int i=0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; 
		}
		
		for(int i=0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", "); // 1,2,3,0,0,
			
			
		}
	}
}
