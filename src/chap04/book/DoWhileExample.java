package chap04.book;

import java.util.Scanner;                      // Scanner 클래스 사용하게 위해 생성   

public class DoWhileExample {
	public static void main(String[] args) {
		
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);  // Scanner 객체 생성
		String inputString;
		
		do {
			System.out.print(" > ");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while ( ! inputString.equals("q")); // 문자열 비교할 때 equals()메소드 사용
		
		System.out.println();
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
