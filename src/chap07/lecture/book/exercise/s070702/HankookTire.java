package chap07.lecture.book.exercise.s070702;

public class HankookTire extends Tire {
	
	//필드
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	//메소드
	
	@Override // 출력 내용을 달리하기 위해 재정의(오버라이딩)한 roll()메소드
	public boolean roll() {
		
		++accumulatedRotation; // 누적회전수 1 증가
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " +
		(maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
