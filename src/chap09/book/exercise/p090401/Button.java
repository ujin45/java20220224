package chap09.book.exercise.p090401;

public class Button {
	
	OnClickListener listener;   //인터페이스 타입 필드
	
	// 매개 변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		//구현 객체의 onClick() 메소드 호출
		listener.onClick();
	}
	
	//중첩 인터페이스 
	interface OnClickListener {
		void onClick();
	}
}
