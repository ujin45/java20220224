package chap06.lecture.p04method;

public class Calculator2 {
	
//	int sum(int n1, int n2, int n3, int n4) {
//		return n1 + n2 + n3 + n4;
//		
//	}
	// varargs (가변길이 매개변수)
	int sum(int...nums) { 
		System.out.println("nums의 길이 : " + nums.length);
		
		int sum = 0;
		
		for (int num : nums) {
			sum += num;
		}
		
		return sum;
	}
	
	// 가변길이 매개변수는 항상 마지막에 작성
	int varSum(String name, int...nums) {
		return 0;
	}

	public void concat(String... strs) {
		for(String str : strs) { //향상된 for문 사용
			System.out.print(str);  // println(x) print로 연결해서 출력됨.
		}
		System.out.println();		
	}	
}
