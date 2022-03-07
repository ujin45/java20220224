package chap05.book;

public class ArrayCopyExample {
	public static void main(String[] args) {
		
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5]; // length 길이가 5
		
		System.arraycopy (oldStrArray, 0, newStrArray, 0, oldStrArray.length );
		               // (원본배열, 복사할 시작인덱스, 새배열, 붙여넣을 시작 인덱스, 복사할 개수)
		
		for(int i=0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", "); // java,array,copy,null,null,
		}
	
	}
}
