package chap99.Leetcode;

public class S344 {

	//input : s=["h","e","l","l","o"]  
	//output : ["o","l","l","e","h"]		
	
	public void reverseString(char[] s) {

		int left = 0;
		int right = s.length - 1;

		while (left < right) {
			swap(s, left, right);

			left++;
			right--;
		}
	}

	private void swap(char[] s, int left, int right) {
		char temp = s[left];
		s[left] = s[right];
		s[right] = temp;
	}
}
