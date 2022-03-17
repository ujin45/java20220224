package chap07.lecture.book.exercise.p05;

public class Child extends Parent {
	
	private int studentNo;
	
	public Child(String name, int studentNo) {
//		this.name = name; (X)
		super(name); // 부모 생성자 호출해야함. 
		this.studentNo = studentNo;
	}
	
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
}
