package chap07.lecture.polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App09 {
	public static void main(String[] args) {
		
		Animal animal = new StreetCat();
		animal.breathe();
		animal.cry();
		
		// angry 메소드 실행하고 싶다.
		Chihuahua chihuahua = (Chihuahua) animal; // ClassCastException
		chihuahua.angry();                        // 문법 오류는 없으니 실행불가(위험)
		
		// ****강제 형변환(casting) 은 매우 주의해서 작성해야 함.****
		System.out.println("명령문 진행 계속..........");
		
	}
}
