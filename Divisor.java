class Solution8 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n;i++) 
        	if(n%i==0)
        		answer+=i;
        return answer;
    }
}
public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		Solution8 sol = new Solution8();
		System.out.println(sol.solution(n));

	}

}
