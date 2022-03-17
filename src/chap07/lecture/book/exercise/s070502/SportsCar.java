package chap07.lecture.book.exercise.s070502;

public class SportsCar extends Car{
	
	@Override // 오버라이딩 할 수 없음 final 메소드를 사용했기 때문에 
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
