package chap08.book.exercise.p080201;

public interface RemoteControl {
	
	//상수 : constant
	//타입 상수명 = 값;
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드 : abstract method
	//타입 메소드명(매개변수..);
	//메소드 선언부만 작성 (추상메소드)
	public void turnOn();
	public void trunOff();
	public void setVolume(int volume);
	
	//디폴트 메소드 : default method
	//default 타입 메소드명(매개변수,...){...}
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	
	//정적 메소드 : static method
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
