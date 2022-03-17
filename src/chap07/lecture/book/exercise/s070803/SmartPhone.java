package chap07.lecture.book.exercise.s070803;

public class SmartPhone extends Phone{

	// 실체 클래스
	
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드
	public void internetsearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
