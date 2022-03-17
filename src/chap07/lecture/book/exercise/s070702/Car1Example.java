package chap07.lecture.book.exercise.s070702;

public class Car1Example {
	public static void main(String[] args) {
		
		Car1 car1 = new Car1();
		
		for(int i=1; i<=5; i++) {
			
			int problemLocation = car1.run();
			if(problemLocation != 0) {
				System.out.println(car1.tires[problemLocation-1].location + " HankookTire로 교체");
				car1.tires[problemLocation-1] = 
						new HankookTire(car1.tires[problemLocation-1].location, 15);
			}
			System.out.println("----------------------------------------------");
		}
	}
}
