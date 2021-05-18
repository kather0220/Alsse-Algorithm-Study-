class Solution5 {
	
	
    public int solution(int n) {
    	//int ans = 0;
    	if(n==0)
    		return 0;
    	if(n==1)
    		return 1;
    	int a0 = 0;
    	int a1 = 1;
    	int sum = 0;
    	for(int i=2;i<=n;i++) {
    		sum= a0+a1;
    		a0=a1;
    		a1=sum;
    		
    	}
    	
       return sum%1234567;
    }
}
public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		Solution5 sol = new Solution5();
		System.out.println(sol.solution(n));
	}

}
