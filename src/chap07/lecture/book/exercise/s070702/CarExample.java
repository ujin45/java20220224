package chap07.lecture.book.exercise.s070702;

public class CarExample {
	public static void main(String[] args) {
		
		Car car = new Car();  // Car 객체생성
		
		for(int i=0; i<5; i++) {  // Car 객체의 run() 메소드 5번 반복 실행
			int problemLocation = car.run();
			
			
			switch(problemLocation) {
			  
			  case 1 : //앞왼쪽 타이어가 펑크 났을때 한국타이어로 교체
				  System.out.println("앞왼쪽 HankookTire로 교체");
				  car.frontLeftTire = new HankookTire("앞왼쪽",15);
				  break;
			  case 2 : //앞오른쪽타이어가 펑크 났을 때 금호타이어로 교체
				  System.out.println("앞오른쪽 KumhoTire로 교체");
				  car.frontRightTire = new HankookTire("앞오른쪽", 13);
				  break;
			  case 3 : //뒤왼쪽타이어가 펑크 났을 때 한국타이어로 교체
				  System.out.println("뒤왼쪽 HankookTire로 교체");
				  car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				  break;
			  case 4 : //뒤오른쪽타이어가 펑크 났을 때 금호타이어로 교체
				  System.out.println("뒤오른쪽 KumhoTire로 교체");
				  car.backRightTire = new HankookTire("뒤오른쪽", 17);
				  break;
			}
			System.out.println("---------------------------------"); // 내용구분선  
		}
			
	}
}
