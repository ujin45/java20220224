package chap06.book.s060802;

public class Car {
	// 필드
	int gas;
	
	// 생성자
	
	
	// 매소드
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;   // 종료되고 false를 리턴
		} else
		System.out.println("gas가 있습니다.");
		return true;   // 종료되고 true를 리턴
	}
	
	
	void run() {
		while(true) {
			if(gas >0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return;  // 매소드 실행종료
			}
		}
	}
}
