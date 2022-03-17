package chap07.lecture.book.exercise.s070803;

public class PhoneExample {
	public static void main(String[] args) {
		
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();   // Phone의 메소드
		smartPhone.internetsearch();
		smartPhone.trunOff();  // Phone의 메소드
	}
}
