import java.util.*;
// 같은 숫자는 싫어 ( 테스트케이스 에러 )
class Solution6 {
    public Vector<Integer> solution(int []arr) {
    	
        Vector<Integer> answer = new Vector<Integer>();
        if(arr.length==1)
        	answer.add(arr[0]);
        for(int i=1; i<arr.length;i++) {
        	/*
        	if(arr[i-1]!=arr[i]&&arr[i]!=arr[i+1])
        		answer.add(arr[i]);
        	else if((arr[i]==arr[i+1]&&arr[i]!=arr[i-1])||(arr[i]==arr[i-1]&&arr[i]!=arr[i+1]))
        		answer.add(arr[i]);
        	*/
        	
        	if(i==arr.length-1) {
        		
        			answer.add(arr[i]);
        			break;
        	}
        		
        	else if(arr[i-1]==arr[i]&&arr[i]!=arr[i+1])
        		answer.add(arr[i]);
        	
        	else if(arr[i-1]!=arr[i]&&arr[i]!=arr[i+1])
        		answer.add(arr[i]);
        }
        
        
        return answer;
    }
}

public class NoSameNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,1,1,1,1,1,0,0,1};
		
		Solution6 sol = new Solution6();
		System.out.println(sol.solution(arr));
	}

}
