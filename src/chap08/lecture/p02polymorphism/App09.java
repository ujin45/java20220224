package chap08.lecture.p02polymorphism;

import java.util.Scanner;

import chap08.lecture.p01interface.example_class.Cat;
import chap08.lecture.p01interface.example_class.Chihuahua;
import chap08.lecture.p01interface.example_class.Pet;
import chap08.lecture.p01interface.example_class.Retriever;

public class App09 {
	public static void main(String[] args) {
		
		Pet pet1 = new Retriever();
		Pet pet2 = new Chihuahua();
		Pet pet3 = new Cat();
		
		pet1.sit();
		pet2.sit();  
		pet3.sit();  // 재정의한 메소드 실행 
		
		
		//api source 보기
		String str ="java";
		Scanner scanner;
		
	}
}
