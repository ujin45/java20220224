package chap07.lecture.book.exercise.s070401;

public class ComputerExample {
	public static void main(String[] args) {
		
		int r = 0;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r)); // 재정의된 매소드 호출
	}
}
