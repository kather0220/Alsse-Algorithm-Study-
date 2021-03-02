import java.util.*;
// 두개 뽑아서 더하기
class Solution {
    public Vector<Integer> solution(int[] numbers) {
    	
    	
        Vector<Integer> answer = new Vector<Integer>();
       
        int i,j;
        int k=0;
        for(i=0; i<numbers.length;i++) {
        	for(j=0;j<numbers.length;j++) {
        		
        		if(!answer.contains(numbers[i]+numbers[j])) {
        			answer.add(numbers[i]+numbers[j]);
        			k++;
        			
        		}
        		else
        			continue;
        	}
        }
        Collections.sort(answer);
        return answer;
    }
}

public class PlusMinusCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,4,5};
		
		Solution sol = new Solution();
		System.out.println(sol.solution(numbers));
	}

}
