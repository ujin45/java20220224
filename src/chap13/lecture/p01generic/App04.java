package chap13.lecture.p01generic;

import chap08.lecture.p01interface.example_class.Animal;
import chap08.lecture.p01interface.example_class.Chihuahua;

public class App04 {
	public static void main(String[] args) {
		
		Container4<String> o1 = new Container4 <String>();
		Container4<Integer> o2 = new Container4 <Integer>();
		Container4<Animal> o3 = new Container4 <Animal>();
		
		//기본타입은 type parameter 사용불가 (참조타입만 가능)
		// 8개 wrapper class 이용 (auto boxing, unboxing)
//		Container4<int> o4 = new Container4<int>(); 
		
		// type parameter 생략 가능  diamond <>();  
		Container4<Chihuahua> o4 = new Container4 <>();
	}
	
}


class Container4 <T> {
	
	public void method(T param) {
		
	}
}