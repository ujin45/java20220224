package chap05.book;

public class EnumMethodExample {

	public static void main(String[] args) {
		
		// name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);  // SUNDAY(6)
		
		
		// ordinal() 메소드 : 전체 열거 객체 중 몇 번째 객체인지 알려줌.
		int ordinal = today.ordinal();
		System.out.println(ordinal);   // 6
		
		
		// compareTo() 메소드  : 매개값 객체 기주으로 전후 몇번째 위치하는지 비교
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);  // -2
		System.out.println(result2);  //  2
		
		
		// valueOf() 메소드 : 매개값 문자열과 동일한 문자열 가지는 객체 리턴 
		if(args.length == 1) {
			
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요");
			} else {
				System.out.println("평일이군요");
			}
		}
		
		
		// values() 메소드 : 모든 열거 객체들을 배열로 만들어 리턴 
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
