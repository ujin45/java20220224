package chap06.lecture.p02field;

public class App01 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		c1.speed = 100;
		c2.speed = 30;
		
		System.out.println(c1.speed);
		
		c1.color = "red";
		c2.color = "blue";
		
		c1.model = "model Y";
		c2.model = "avante";
		
	}
}
