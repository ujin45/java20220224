package chap99.progammers;

public class Solution12949 {
	
	
	
	// 2차원 행렬 arr1과 arr2를 입력받아, 
	// arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.
	
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i=0; i < arr1.length; i++) {
            for(int j=0; j<arr2[0].length; j++) {
                for(int k=0; k< arr1[i].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        
        return answer;
    }
}

