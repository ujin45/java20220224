package chap04.book.Exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------------");
			System.out.println("선택>");
			int num = scanner.nextInt();
			int money = 0;
			
			switch (num) {
			case 1 :
				System.out.print("예금액>");
				money = scanner.nextInt();
				balance += money;
				break;
			case 2 :
				System.out.print("출금액>");
				money = scanner.nextInt();
				balance -= money;
				break;
			case 3 :
				System.out.println("잔고>" + balance);
				break;
			case 4:
				run = false;
				break;
				
				
			}
			
//			System.out.print("예금액>");
//			String str1 = scanner.nextLine();
//			int num1 = Integer.valueOf(str1);
//			
//			System.out.print("출금액>");
//			String str2 = scanner.nextLine();
//			int num2 = Integer.valueOf(str2);
//			
			
		}
					
		System.out.println("프로그램 종료");
		scanner.close();
		
	}
}
