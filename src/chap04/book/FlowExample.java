package chap04.book;

public class FlowExample {
	public static void main(String[] args) {
		
		int score = ((int)(Math.random()* 10)) +1;  // 1에서 10사의 값을 얻음
		
		switch (score * 100) {   // 그 값의 *100  100~1000까지 나옴
		case 100 :
			System.out.println("당신의 점수는 100이고, 상품은 자전거입니다.");
			break;
		case 200 :
			System.out.println("당신의 점수는 200이고, 상품은 자전거입니다.");
			break;
		case 300 :
			System.out.println("당신의 점수는 300이고, 상품은 자전거입니다.");
			break;
		case 400 :
			System.out.println("당신의 점수는 400이고, 상품은 자전거입니다.");
			break;
		default :   // 500부터 1000까지 출력
			System.out.println("죄송하지만 당신의 점수에 해당 상품이 없습니다.");
		
		}
	}
}
