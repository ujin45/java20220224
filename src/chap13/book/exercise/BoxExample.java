package chap13.book.exercise;

public class BoxExample {

	public static void main(String[] args) {
		
		Box<String>box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		
		Box<Integer>box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		

		
//		Box box = new Box();
//		
//		box.set("홍길동");                    // String -> Object 자동타입변환
//		String name = (String) box.get();   // Object -> String 강제타입변환
//		
//		
//		box.set(new BoxExample());               // Apple -> Object 자동타입변환
//		BoxExample apple = (BoxExample)box.get();     // Object -> Apple 강제타입변환
		
	}
}
