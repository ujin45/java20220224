package chap07.lecture.polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Chihuahua;

public class App07 {
	public static void main(String[] args) {
		
		Chihuahua chihuahua = new Chihuahua();
		chihuahua.breathe();
		chihuahua.cry();
		chihuahua.angry();
		
		Animal animal = chihuahua; // 자동형변환
		animal.breathe();
		animal.cry();
//		animal.angry();  실행할 수 없다. 문법오류
		
	}
}
