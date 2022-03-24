package chap13.lecture.p01generic;

import java.util.ArrayList;

import chap08.lecture.p01interface.example_class.Animal;
import chap08.lecture.p01interface.example_class.Canine;
import chap08.lecture.p01interface.example_class.Chihuahua;
import chap08.lecture.p01interface.example_class.Retriever;

public class App10 {

	public static void main(String[] args) {
		
		ArrayList<Animal> list1 = new ArrayList<>();
		method(list1);
		
		ArrayList<Canine> list2 = new ArrayList<>();
		method(list2);
						
	}
	// 상하위 관계가 있어야함. Animal- Canine(o) /  Pet- Animal(X)
	public static void method(ArrayList<? super Canine> list) {
		
		list.add(new Chihuahua());
		list.add(new Retriever());
	}
}
