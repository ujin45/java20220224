package chap07.lecture.book.exercise.p06;

public class Parent {
	
	public String nation;
	
	// 부모 생성자 1
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	// 부모 생성자 2
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
