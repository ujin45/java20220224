package chap02.book;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) { // for 중괄호{}를 5번 반복 실행
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}                                     // \t : 탭만큼 칸을 띄어주는 역할     
	}
}
