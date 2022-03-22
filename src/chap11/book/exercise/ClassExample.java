package chap11.book.exercise;

import chap06.book.s061401.Car;

public class ClassExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		Class clazz1 = car.getClass();
		
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		
		
		try {
			Class clazz2 = Class.forName("chap06.book.s061401.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
