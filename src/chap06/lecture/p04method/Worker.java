package chap06.lecture.p04method;

public class Worker {
	String name;
	
	Worker(String name){
		this.name = name;
	}
	
	// 매소드명 : lowerCamelCase
	void work() {
		System.out.println(name + "이(가) 일합니다.");
		
	}
}
