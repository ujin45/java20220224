package chap06.lecture.p03constructor;

public class Computer {
	String cpu;
	String ram;
	String ssd;
	
	//생성자 여러개 작성 가능 (overloading)
	//생성자의 파라미터의 수, 타입, 순서가 달라야 함. 하나라도 달라야함.
	Computer(String cpu, String ram, String ssd) {
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
		
	}
	
	Computer(String cpu, String ram) {
		this.cpu = cpu;
		this.ram = ram;
	}
	
	Computer(String ram) {
		this.ram = ram;
	}
	
	Computer(int price) {
		
	}
	
	Computer(String cpu, int price) {
		
	}
	Computer(int price, String cpu) {
		
	}
}
