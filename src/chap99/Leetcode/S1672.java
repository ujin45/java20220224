package chap99.Leetcode;

public class S1672 {
	
	public int maximumWealth(int[][] accounts) {
        
		//input : accounts=[[1,5],[7,3],[3,5]]
		//output : 10 (합이 가장 큰 값)
		// 각 account 합을 구함  - 구한값과 기존 최대값 비교 - 최대값 리턴 
		
		
		int[] sum = new int[accounts.length];
        int max = 0;
        
        for(int i=0; i<accounts.length; i++) {
            for(int j=0; j<accounts[i].length; j++) {
                sum[i] += accounts[i][j];
            }
                 max = Math.max(max,sum[i]);
        }
        return max;
    }
}

