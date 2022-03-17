package chap08.book.exercise.p080502;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		
		System.out.println();
		
		Car myCar2 = new Car();
		
		myCar2.run2();
		
		myCar2.tires[0] = new KumhoTire();
		myCar2.tires[1] = new KumhoTire();
		
		myCar2.run2();
		
	}
}
