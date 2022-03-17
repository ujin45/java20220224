package chap07.lecture.p01inheritance;

public class SubClass2 extends SuperClass2 {
	
	public SubClass2() {
		//상위 클래스 생성자 호출하는 코드
		super(); // 생략해도 자동으로 추가됨. 순서 바뀌면 안됨. 
		System.out.println("서브 클래스2 생성자 실행");
	}
}
