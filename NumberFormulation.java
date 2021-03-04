class Solution1 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++) {
        	int sum = 0;
        	int temp = i;
        	while(sum<n) {
        		sum+=temp;
        		temp++;
        	}
        	if(sum==n)
        		answer++;
        }
        return answer;
    }
}
public class NumberFormulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 sol = new Solution1();
		int n = 15;
		System.out.println(sol.solution(n));
	}

}
