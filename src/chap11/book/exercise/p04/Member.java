package chap11.book.exercise.p04;

public class Member {

	// 필드
	private String id;
	private String name;
	
	//생성자
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}


	// toString()으로 재정의!ㄴ
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	
}
