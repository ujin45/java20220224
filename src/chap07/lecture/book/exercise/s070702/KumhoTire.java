package chap07.lecture.book.exercise.s070702;

public class KumhoTire extends Tire {
	
	//필드
	
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드 : 출력내용을 달리하기 위해 재정의(오버라이딩)한 roll()메소드
	@Override
	public boolean roll() {
		
		++accumulatedRotation; // 누적 회전수 1 증가
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명: " +
		(maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}
