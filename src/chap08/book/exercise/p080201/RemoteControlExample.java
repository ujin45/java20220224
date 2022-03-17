package chap08.book.exercise.p080201;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl.changeBattery();
		
		
		RemoteControl rc = null; // 인터페이스 변수 선언
		rc = new Television();
		rc = new Audio();
		
		
		rc = new Television();  // 텔레비젼 객체를 인터페이스 타입에 대입
		rc.turnOn();
		rc.trunOff();           // 인터페이스 turnOn(), turnOff() 호출
		rc.setMute(true);
		
		rc = new Audio();       // 오디오 객체를 인터페이스 타입에 대입
		rc.turnOn();
		rc.trunOff();           // 인터페이스 turnOn(), turnOff() 호출
		rc.setMute(true);
		
	}
}
