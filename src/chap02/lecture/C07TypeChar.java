package chap02.lecture;

public class C07TypeChar {
	public static void main(String[] args) {
		// 문자형 : char(2)
		char var1 = ' ';
//		char var2 = '';
		char var3 = '\\';
		char var4 = 'a';
		char var5 = '가';
		char var6 = '나';
		char var7 = '\uac00';  // u : 유니코드  '가'의 ac00 이라는 코드 
		System.out.println(var7);
		
		
		int var8 = var7;
		System.out.println(var8);
	
		
		// 확인문제 5번 
		byte byteValue = 10;
		char charValue = 'A';
		
		int intValue = byteValue;
		int intValue2 = charValue;
//		short ShortValue = charValue2;
		double doubleValue = byteValue;
	}
}
