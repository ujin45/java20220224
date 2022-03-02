package chap04.book.Exercise;

public class Exercise03 {
	public static void main(String[] args) {
		 
		 // for 문을 이용해서 1부터 100까지 성수중에서 3의 배수의 총합을 구하는 코드 
		 int sum = 0;
		 int i = 0;
		 for (i = 1; i <= 100; i++) { // i +=3 (if문 사용 안 할때) 
			 if((i % 3) == 0) {       
				 sum = sum + i;
			 }
		 }
		 
		 System.out.println("3의 배수의 합 : " + sum);
	}
}
