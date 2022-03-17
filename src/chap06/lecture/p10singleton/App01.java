package chap06.lecture.p10singleton;

public class App01 {
	public static void main(String[] args) {
		
//		Manager m1 = new Manager();
//		Manager m2 = new Manager();
		
		Manager m1 = Manager.getInstance(); //366712642
		Manager m2 = Manager.getInstance(); //366712642
		
		System.out.println(m1.hashCode());  //366712642 
		System.out.println(m2.hashCode());  //1829164700 
	}
}
