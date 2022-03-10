package chap06.lecture.p03constructor;

public class Desk {
	int weight;
	String color;
	
	
	// 생성자
	// 생성자명은 클래스명과 같아야함.
	// 생성자는 여러개 작성될 수 있다.
	// 생성자를 작성하지 않으면 기본생성자(파라미터 없는 생성자)가 자동으로 만들어짐.
	// 생성자를 작성하면 기본생성자(파라미터가 없는 생성자)는 자동으로 만들어지지 않음.
	
	Desk() {
		// 필드를 초기화 하는 코드
		weight = 1000;
		color = "green";
	}
	
	Desk(int w, String c) {
		weight = w;
		color = c;
	}
}
