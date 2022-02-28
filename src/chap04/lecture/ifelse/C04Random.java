package chap04.lecture.ifelse;

public class C04Random {
	 public static void main(String[] args) {
		
		 // 1 ~ 10 사이의 임의수 자연수 얻는 과정
		 System.out.println("1~10 임의의 자연수");
		 double n1 = Math.random(); // 0.0 <= n < 1.0
		 System.out.println(n1); // 실행 버튼을 누를때 마다 범위내의 다른 값이 나옴.
		 System.out.println(n1 * 10);  // 0~9.999999까지 나옴.
		 
		 double n2 = n1 *10;
		 System.out.println(n2);
		 
		 int n3 = (int) n2;
		 System.out.println(n3);
		 
		 int n4 = n3 +1;
		 System.out.println(n4);
		 
		 // 주사위 (1~6)
		 System.out.println("주사위");
		 System.out.println(((int)(Math.random()*6)) + 1);  // 1~5까지 나타나니까 +1해서 6까지
		 
		 // 로또번호 (1~45) 
		 System.out.println("로또");
		 System.out.println(((int)(Math.random()*45)) +1);  // 1~44까지 나타나니까 +1해서 45까지
		 
	}
}
