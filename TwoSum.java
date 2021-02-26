
// 두 정수 사이의 합
class Solution8 {
    public long solution(int a, int b) {
    	
    	long answer = 0;
    	
    	
    	if(a==b) {
    		answer = a;
    	}
    	else {
    		for(int i=Math.min(a, b); i<=Math.max(a, b); i++)
    			answer+=i;
    	}
    	
        return answer;
    }
}
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 3;
		Solution8 sol = new Solution8();
		System.out.println(sol.solution(a, b));
	}

}
