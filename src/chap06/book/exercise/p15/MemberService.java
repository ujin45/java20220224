package chap06.book.exercise.p15;

public class MemberService {
	
	boolean login (String id, String password) {
//		return id.equals("hong")&& password.contentEquals("12345");
		if( id == "hong" && password == "12345") {
			return true;
		}else {
			return false;
		}
	}
	
	void logout (String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
}
