package chap09.book.exercise.p05;

public class Anonymous {
	
	//중첩 클래스
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
			
		}
	};
			
					
	// 지역 메소드 
	void mehtod1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
				
			}
		};
				
				
				
	 localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
