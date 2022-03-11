package chap06.lecture.p06final;

public class App02 {

	
	int i = 3;
	final int j = 5;
	final int k;
	
	App02() {
		k = 30;
	}
	public static void main(String[] args) {
		App02 o1 = new App02();
		System.out.println(o1.i);
		o1.i = 4;
//		o1.j = 6;  위에 한번 할당 되었기 때문에 안 됨.
//		o1.k = 60; 위에 한번 할당 되었기 때문에 안 됨. 
		System.out.println(o1.i);
		
	}
}
