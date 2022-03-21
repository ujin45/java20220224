package chap10.lecture.p03checked;

public class App04 {

	public static void main(String[] args) {
		
		try {
			Class.forName("");  // ctrl + 1 눌러서 힌트 얻어서 try/catch 사용
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
