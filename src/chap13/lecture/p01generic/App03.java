package chap13.lecture.p01generic;

public class App03 {

	public static void main(String[] args) {
		
		Container3<String> con1 = new Container3<String>();
		con1.setContent("java");
//		con1.setContent(1); XXX
		String str1 = con1.getContent(); // cast 필요 없음 . 형변환 필요 없다.
		
		Container3<Integer> con2 = new Container3<Integer>();
		con2.setContent(333);
		int i1 = con2.getContent();
		
	}
}


class Container3<T> {  // <type parameter> : 타입을 받는 파라미터. 관습상 대문자  한글자 T 사용
	                   // : 인스턴스 만들때 타입파라미터에 작성한 타입으로 클래스 내부의 타입이 결정 
	                   // : type parameter가 있는 타입 : generic type
	private T content;
	
	public T getContent() {
		return content;
	}
	
	
	public void setContent(T content) {
		this.content = content;
	}
}