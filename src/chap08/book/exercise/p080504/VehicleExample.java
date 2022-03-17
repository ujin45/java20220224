package chap08.book.exercise.p080504;

public class VehicleExample {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); Vehicle 인터페이스에는 checkFare() 가 없음
		
		Bus bus = (Bus) vehicle; //강제 타입변환
		
		bus.run();
		bus.checkFare();  // Bus클래스에는 CheckFare()가 있음
	}
}
